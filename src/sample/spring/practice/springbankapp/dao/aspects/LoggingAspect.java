package sample.spring.practice.springbankapp.dao.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class);

    @Pointcut(value="execution(* sample.spring.practice.springbankapp.dao.*Service.*(..))")
    public void invokeService() {}

    @Before(value="invokeService()")
    public void log(JoinPoint joinPoint) {
        logger.info("Entering "
                + joinPoint.getTarget().getClass().getSimpleName() + "'s "
                + joinPoint.getSignature().getName());

        Object[] args = joinPoint.getArgs();
        for (int i = 0 ; i < args.length ; i++) {
            logger.info("args[" + i + "] -> " + args[i]);
        }
    }
}