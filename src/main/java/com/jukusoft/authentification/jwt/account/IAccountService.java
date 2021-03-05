package com.jukusoft.authentification.jwt.account;

import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IAccountService {

    public Optional<AccountDTO> loginUser(String username, String password);

}
