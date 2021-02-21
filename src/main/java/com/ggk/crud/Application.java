package com.ggk.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication 
//@EnableAutoConfiguration
//@ComponentScan(basePackages={"com.ggk.crud"})
@EnableJpaRepositories(basePackages="com.ggk.crud.repositories")
@EnableTransactionManagement
@EntityScan(basePackages="com.ggk.crud.entities")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
}
