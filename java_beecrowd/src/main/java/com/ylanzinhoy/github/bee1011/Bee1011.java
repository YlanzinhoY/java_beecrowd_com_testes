package com.ylanzinhoy.github.bee1011;

import java.util.Locale;
import java.util.Scanner;

import com.ylanzinhoy.github.service.Exercicio;

public class Bee1011 implements Exercicio {

    @Override
    public String ex() {
        Locale.setDefault(Locale.US);
        try (var sc = new Scanner(System.in)) {
            final double PI = 3.14159;
            var calc = (4.0/3) * PI * Math.pow(sc.nextInt(), 3);
            System.out.printf("VOLUME = %.3f%n", calc);
            return String.format("VOLUME = %.3f", calc);
        }
    }
    
}
