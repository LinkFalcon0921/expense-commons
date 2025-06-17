package com.flintcore.expenses.commons.utils.jwts;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/*
* Move to another package
* */
public interface JwtUtils {
    static List<GrantedAuthority> mapAuthorities(String... authorities) {
        return mapAuthorities(Arrays.asList(authorities));

    }

    static List<GrantedAuthority> mapAuthorities(List<String> authorities) {
        return authorities
                .stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    static List<String> extractAuthorities(GrantedAuthority... authorities) {
        return extractAuthorities(Arrays.asList(authorities));
    }

    static List<String> extractAuthorities(Collection<? extends GrantedAuthority> authorities) {
        return authorities
                .stream()
                .map(GrantedAuthority::getAuthority)
                .toList();
    }
}
