package com.ylanzinhoy.github;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.ylanzinhoy.github.bee1002.Bee1002;

public class TemplateTest {

    public static void exceute(String input) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
      
    }
}
