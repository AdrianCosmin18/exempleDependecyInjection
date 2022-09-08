package com.example.exemplu.view;

import com.example.exemplu.controller.Controller;
import com.example.exemplu.model.Ball;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Scanner;

@Configuration
public class View {

    private Scanner read;

    private Controller controller;

    public View(Controller controller){
        read = new Scanner(System.in);
        this.controller = controller;
    }

    private void menu(){
        System.out.println("======================================");
        System.out.println("1. List of balls.");
        System.out.println("2. Filter balls by brand");
        System.out.println("3. Add a ball");
        System.out.println("4. Filter balls by size");
        System.out.println("5. Stop.");
    }

    //@Bean
    public void play() {

        boolean run = true;
        int alegere;

        while (run) {

            menu();
            System.out.println("\nTasta : ");
            alegere = Integer.parseInt(read.nextLine());

            switch (alegere){

                case 1: controller.afisare();
                break;

                case 2: filterBallsByBrand();
                break;

                case 3: addBall();
                break;

                case 4: filterBallBySize();
                break;

                case 5: run = false;
                break;
            }
        }
    }

    private void filterBallsByBrand(){

        System.out.print("Type ball's brand you want to see:");
        String brand = read.nextLine();

        List<Ball> balls = controller.getBallsByBrand(brand);
        balls.forEach(ball -> System.out.println(ball));
    }

    private void addBall(){

        int id = controller.nextID();
        System.out.print("Type ball's brand: ");
        String brand = read.nextLine();

        System.out.print("Type ball's color: ");
        String color = read.nextLine();

        System.out.print("Type ball's size: ");
        int size = Integer.parseInt(read.nextLine());

        System.out.print("Type ball's weight(in grams): ");
        double weight = Double.parseDouble(read.nextLine());

        controller.add(new Ball(id, brand, color, size, weight));
        System.out.println("Ball successfully added !!!");
    }

    private void filterBallBySize(){
        System.out.print("Type ball's size you want to see:");
        int size = Integer.parseInt(read.nextLine());

        List<Ball> balls = controller.getBallsBySize(size);
        balls.forEach(ball -> System.out.println(ball));
    }
}
