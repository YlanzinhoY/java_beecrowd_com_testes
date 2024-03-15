package com.ylanzinhoy.github.bee1002;

import java.util.Locale;
import java.util.Scanner;

public class Bee1002 {
    

    public static String ex() {
        Locale.setDefault(Locale.US);
        final double PI = 3.14159;
        try(var sc = new Scanner(System.in)) {
            var n = sc.nextDouble();
            var calc = PI * Math.pow(n, 2);
            return String.format("A=%.4f", calc);

        }

    }
    
}
