package com.example.exemplu.controller;

import com.example.exemplu.model.Ball;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

@Repository
public interface Controller {


    void load();

    void afisare();
}
