package com.example.exemplu.controller;

import com.example.exemplu.model.Ball;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component(value = "controller2")
public class ControllerImpl2 implements Controller{

    private List<Ball> balls;

    public ControllerImpl2() {
        load();
    }

    @Override
    public void load(){
        try{
            balls = new ArrayList<>();
            Scanner read = new Scanner(new File("src/main/java/com/example/exemplu/data/fisier2.txt"));
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

    @Override
    public List<Ball> getBallsByBrand(String brand){return null;}

    public int nextID(){return 0;}

    @Override
    public void add(Ball ball) {

    }

    @Override
    public List<Ball> getBallsBySize(int size) {
        return null;
    }
}
