package sample.spring.practice.springbankapp.dao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {

    private static Logger logger = Logger.getLogger(BankAccountServiceImpl.class);
    @Autowired
    private BankAccountDao bankAccountDao;

    @Override
    public int createBankAccount(BankAccountDetails bankAccountDetails) {
        logger.info(String.format("createBankAccount method invoked with params (BankAccountDetails=%s", bankAccountDetails.toString() ));
        return bankAccountDao.createBankAccount(bankAccountDetails);
    }
}