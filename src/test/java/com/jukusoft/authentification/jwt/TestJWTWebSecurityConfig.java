package com.jukusoft.authentification.jwt;

import com.jukusoft.authentification.jwt.config.JWTWebSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@EnableWebSecurity
public class TestJWTWebSecurityConfig extends JWTWebSecurityConfig {

    @Override
    protected String[] listPermittedPages() {
        return new String[]{"test"};
    }

}
