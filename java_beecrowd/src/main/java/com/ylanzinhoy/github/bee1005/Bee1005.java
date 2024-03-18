package com.ylanzinhoy.github.bee1005;

import java.util.Locale;
import java.util.Scanner;

import com.ylanzinhoy.github.service.Exercicio;

public class Bee1005 implements Exercicio {

    @Override
    public String ex() {
        Locale.setDefault(Locale.US);
        try(var sc = new Scanner(System.in)) {

            var pesoA = 3.5;
            var pesoB = 7.5;
            var result = (sc.nextDouble() * pesoA + sc.nextDouble() * pesoB) / (pesoA + pesoB);
            return String.format("MEDIA = %.5f", result);
        }
    }
    
}
