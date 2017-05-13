package sample.spring.practice.springbankapp.dao;
import sample.spring.practice.springbankapp.dao.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
    void subtractFromAccount(int bankAccountId, int amount);
}
