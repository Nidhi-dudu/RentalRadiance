package com.rentalradiance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;




@SpringBootApplication(
    exclude = {
        SecurityAutoConfiguration.class
    }
)


public class RentalRadianceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(RentalRadianceApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
