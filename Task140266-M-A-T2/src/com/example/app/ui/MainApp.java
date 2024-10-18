package com.example.app.ui;

import com.example.app.core.BasicCalculator;

public class MainApp {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();
        int result = calculator.add(10, 20);
        System.out.println("Result: " + result);
    }
}
