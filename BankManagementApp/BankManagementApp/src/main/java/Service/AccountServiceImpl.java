package Service;

import Repo.AccountRepository;
import com.bankapp.BankManagementApp.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountRepository repo;


    @Override
    public Account createAccount(Account account) {
        Account account_saved = repo.save(account);
        return account_saved;
    }

    @Override
    public Account getAccountDetailsByAccountNumber(Long accountNumber) {
        Optional<Account> account = repo.findById(accountNumber);
        if(account.isEmpty()) {
            throw new RuntimeException("Account is not present");
        }
        Account account_found=account.get();
        return account_found;
    }

    @Override
    public List<Account> getAllAccountDetails() {
        return null;
    }

    @Override
    public Account depositAmount(Long accountNumber, Double amount) {
        return null;
    }

    @Override
    public Account withdrawAmount(Long accountNumber, Double amount) {
        return null;
    }

    @Override
    public void closeAccount(Long accountNumber) {

    }
}



