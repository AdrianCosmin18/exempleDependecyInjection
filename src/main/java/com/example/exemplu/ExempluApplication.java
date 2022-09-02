package com.example.exemplu;

import com.example.exemplu.controller.Controller;
import com.example.exemplu.model.Ball;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExempluApplication {


    @Autowired
    public Ball ballu;

    public static void main(String[] args) {
        SpringApplication.run(ExempluApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(@Qualifier("ceva") Ball ball ,@Qualifier("controller2") Controller controller){
        return args -> {

             Ball cosmin;

            System.out.println( ball);
            System.out.println("ballu :" + ballu);

            controller.afisare();
        };
    }



}

