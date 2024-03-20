package com.ylanzinhoy.github.bee1016;

import java.util.Scanner;

import com.ylanzinhoy.github.service.Exercicio;

public class Bee1016 implements Exercicio{

    @Override
    public String ex() {
        try(var sc = new Scanner(System.in)){
            var calc = sc.nextInt() * 2;
            return String.format("%d minutos", calc);
        }
    }
    
}
