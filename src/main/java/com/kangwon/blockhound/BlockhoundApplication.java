package com.kangwon.blockhound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlockhoundApplication {

    public static void main(String[] args) {
        Blockhoun.install();
        SpringApplication.run(BlockhoundApplication.class, args);
    }

}
