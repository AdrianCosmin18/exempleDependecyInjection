package com.example.exemplu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ball {

    private int id;
    private String brand;
    private String color;
    private int size;
    private double weight;

    public Ball(String brand, String color, int size, double weight) {

        this.brand = brand;
        this.color = color;
        this.size = size;
        this.weight = weight;
    }

    public Ball(String prp){

        String [] text = prp.split(",");
        id = Integer.parseInt(text[0]);
        brand = text[1];
        color = text[2];
        size = Integer.parseInt(text[3]);
        weight = Double.parseDouble(text[4]);
    }


}
