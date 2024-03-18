package com.ylanzinhoy.github.bee1004;

import java.util.Scanner;

import com.ylanzinhoy.github.service.Exercicio;

public class Bee1004 implements Exercicio {

    @Override
    public String ex() {
        try(var sc = new Scanner(System.in)) {
            var calc = sc.nextInt() * sc.nextInt();
            return String.format("PROD = %d", calc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
}