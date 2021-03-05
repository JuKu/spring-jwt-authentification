package com.jukusoft.authentification.jwt.account;

import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IAccountService {

    /**
     * try to login the user. If the login was successful, the account object is returned. Else an empty Optional is returned.
     *
     * @param username username of the user
     * @param password password of the user
     * @return account object, if login was successful, else an empty Optional
     */
    public Optional<AccountDTO> loginUser(String username, String password);

}
