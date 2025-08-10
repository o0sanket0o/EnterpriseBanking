//package com.example.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        //This method is only called once when the application starts; and not on every http requests.
//        //It's job is to setup all the specified rules(below) and create a SecurityFilterChain object that will be used
//        //by spring security in the future.
//        //This SecurityFilterChain object is created (and managed by spring as bean) and used for future.
//        //Now whenever the
//        System.out.println("We have got the http request in filterChain method" + http);
////        http.
////                authorizeHttpRequests(authz -> authz.
////                        requestMatchers("public/**").permitAll()
////                        .anyRequest().authenticated()
////                )
////                .formLogin()
////                .and()
////                .logout();
//
//        http.
//                csrf().disable()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("api/auth/**").permitAll()
//                        .requestMatchers("/admin/**").hasRole("ADMIN")
//                        .requestMatchers("/teller/**").hasRole("TELLER")
//                        .requestMatchers("/customer/**").hasRole("CUSTOMER")
//                        .anyRequest().authenticated()
//                );
////        http.addFilterBefore()
//        return http.build();
//    }
//}
