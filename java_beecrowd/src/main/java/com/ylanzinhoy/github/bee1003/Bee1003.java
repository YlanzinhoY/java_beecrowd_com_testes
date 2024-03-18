package com.ylanzinhoy.github.bee1003;

import java.util.Locale;
import java.util.Scanner;

import com.ylanzinhoy.github.service.Exercicio;

public class Bee1003 implements Exercicio {

    @Override
    public String ex() {
        Locale.setDefault(Locale.US);
        try(var sc = new Scanner(System.in)) {
            var calc = sc.nextInt() + sc.nextInt();
            return String.format("SOMA = %d", calc);

        }
    }


}
