package com.br.security.service;

import com.br.security.repository.CarroUserDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
    public class CarroUserDetailsService implements UserDetailsService {
    private final CarroUserDetailsRepository carroUserDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return Optional.ofNullable(carroUserDetailsRepository.findByUsername(username))
                .orElseThrow(() -> new UsernameNotFoundException("Usuario inexistente."));
    }
}
