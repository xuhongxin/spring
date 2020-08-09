package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    JavaOrmRep javaOrmRep;

    @Override
    public void run(String... args) throws Exception {
        JavaOrm javaOrm = new JavaOrm();
        javaOrm.setAge(11);
        javaOrm.setName("chonghuan");

        javaOrmRep.findAll();
        javaOrmRep.findJavaOrmsByName("chonghuan");


    }
}
