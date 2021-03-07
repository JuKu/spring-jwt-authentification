package com.jukusoft.authentification.jwt;

import com.jukusoft.authentification.jwt.account.AccountDTO;
import com.jukusoft.authentification.jwt.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthentificationService {

    private IAccountService accountService;

    private JwtTokenService jwtTokenService;
    private PasswordEncoder passwordEncoder;

    public AuthentificationService(IAccountService accountService, JwtTokenService jwtTokenService, PasswordEncoder passwordEncoder) {
        this.accountService = accountService;
        this.jwtTokenService = jwtTokenService;
        this.passwordEncoder = passwordEncoder;
    }

    public JWTTokenResponse generateJWTToken(String username, String password) {
        return accountService.loginUser(username, password)
                .map(account -> new JWTTokenResponse(jwtTokenService.generateToken(account.getUserID(), username)))
                .orElseThrow(() -> new UserNotFoundException("Credentials wrong"));
    }

}
