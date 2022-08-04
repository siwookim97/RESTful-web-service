package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@ComponentScan(basePackages={"com.example.restfulwebservice"})
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
public class SecurityConfig {
    //
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth)
//        throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("qwer")
//                .password("{noop}qwer")
//                .roles("USER");
//    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth)
//        throws Exception {
//            auth.inMemoryAuthentication()
//                    .withUser("qwer")
//                    .password("{noop}qwer")
//                    .roles("USER");
//        }
}
