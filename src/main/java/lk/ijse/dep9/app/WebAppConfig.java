package lk.ijse.dep9.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebAppConfig {
//    @Bean
//    public DelegatingFilterProxy delegatingFilterProxy(SecurityFilter securityFilter){
//        return new DelegatingFilterProxy(securityFilter);
//    }

}
