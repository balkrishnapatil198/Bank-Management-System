package Controller;


import Service.AccountService;
import com.bankapp.BankManagementApp.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/account")
public class AccountController {


    @Autowired
    AccountService service;

    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        Account createAccount = service.createAccount(account);

        return ResponseEntity.status(CREATED).body(createAccount);

    }

    @GetMapping("/{id}")
    public Account getAccountByAccountNumber(@PathVariable Long accountNumber) {
        Account account = service.getAccountDetailsByAccountNumber(accountNumber);
        return account;

    }

}

