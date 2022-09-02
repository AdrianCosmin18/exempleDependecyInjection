package com.example.exemplu;

import com.example.exemplu.model.Ball;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//se instanteaza automat obiectul, are bean-uri deobicei
public class Configurator {


    @Bean(name = "ceva")
    //se apeleaza automat metoda, ele returneaza un obiect
    public Ball getBall(){
        System.out.println("getBall");
        return  new Ball("ad","red",12,12.3);
    }

    @Bean
    @Primary
    public Ball smallBall(){
        System.out.println("smallBall");
        return new Ball("snooker", "white", 1, 1200);
    }
}
