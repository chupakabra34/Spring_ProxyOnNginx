package ru.netology.proxyonnginx.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.proxyonnginx.authorizationService.AuthorizationService;
import ru.netology.proxyonnginx.userRepository.UserRepository;


@Configuration
public class AuthorizationConfiguration {

    @Bean
    public AuthorizationService service(UserRepository userRepository) {
        return new AuthorizationService(userRepository);
    }
}