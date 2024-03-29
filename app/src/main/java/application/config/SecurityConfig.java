package application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.apache.catalina.filters.HttpHeaderSecurityFilter;
import org.sprinframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain(HttpHeaderSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpsRequests()
                .anyRequest().authentcated();
        http 
                .forLogin();
        return http.build();               
    }

    @SuppressWarnings("deprecation")
    @Bean
    public NoOpPasswordEncoder(){
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
