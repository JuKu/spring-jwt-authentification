package com.jukusoft.authentification.jwt;


import com.jukusoft.authentification.jwt.account.AccountDTO;
import com.jukusoft.authentification.jwt.account.IAccountService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("iAccountService")
public class TestAccountService implements IAccountService {

    @Override
    public Optional<AccountDTO> loginUser(String username, String password) {
        if (username.equals("test")) {
            return Optional.of(new AccountDTO(1l, "test"));
        }

        return Optional.empty();
    }

}
