package com.ylanzinhoy.github.bee1001;

import java.util.Scanner;

public class Bee1001 {

    public static String ex() {
        try(var sc = new Scanner(System.in)) {
            
            var calc = sc.nextInt() + sc.nextInt();
            return String.format("X = %d", calc);
        }
    }
    


}
