package com.jukusoft.authentification.jwt;

import com.jukusoft.authentification.jwt.account.IAccount;
import com.jukusoft.authentification.jwt.account.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

public interface SessionService<T extends IAccount> {

    public UserAccount findUser(String username);

    public Set<String> listPermissionsOfUser(IAccount user);

    @Cacheable(cacheNames = "granted_authorities")
    public List<GrantedAuthority> getGrantedAuthorities(Set<String> privileges);

}
