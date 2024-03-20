package com.ylanzinhoy.github.bee1017;

import java.util.Locale;
import java.util.Scanner;

import com.ylanzinhoy.github.service.Exercicio;

public class Bee1017 implements Exercicio {

    @Override
    public String ex() {
        Locale.setDefault(Locale.US);
        try(var sc = new Scanner(System.in)) {
            final int km = 12;
            double calc = sc.nextDouble() * sc.nextDouble() / km;

            System.out.printf("%.3f%n", calc);
            return String.format("%.3f", calc);
        }
    }
    
}
