package com.example.exemplu.controller;

import com.example.exemplu.model.Ball;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
@Primary
public class ControllerImpl1 implements Controller{

    private List<Ball> balls;

    public ControllerImpl1() {
        load();
    }

    @Override
    public void load(){
        try{
            balls = new ArrayList<>();
            Scanner read = new Scanner(new File("src/main/java/com/example/exemplu/data/fisier1.txt"));
            while(read.hasNextLine()){
                String text = read.nextLine();
                Ball b = new Ball(text);
                balls.add(b);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
            e.getMessage();
        }
    }

    @Override
    public void afisare(){
        for(Ball b:balls){
            System.out.println(b);
        }
    }
}
