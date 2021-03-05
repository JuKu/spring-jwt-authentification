package com.jukusoft.authentification.jwt;

import com.jukusoft.authentification.jwt.account.IAccount;
import com.jukusoft.authentification.jwt.account.UserAccount;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class TestSessionService implements SessionService {

    @Override
    public UserAccount findUser(String username) {
        return new UserAccount(1l, "test", new ArrayList<>());
    }

    @Override
    public Set<String> listPermissionsOfUser(IAccount user) {
        return Collections.emptySet();
    }

    @Override
    public List<GrantedAuthority> getGrantedAuthorities(Set privileges) {
        return Collections.emptyList();
    }

}
