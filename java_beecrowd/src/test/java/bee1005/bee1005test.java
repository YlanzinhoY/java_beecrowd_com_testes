package bee1005;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ylanzinhoy.github.TemplateTest;
import com.ylanzinhoy.github.bee1005.Bee1005;

public class bee1005test {

    @Test
    void teste1() {
        // arrange
        var result = new Bee1005();
        
        // act
        TemplateTest.exceute("5.0 7.1");
        
        // assert
        assertEquals("MEDIA = 6.43182", result.ex());
    }

    @Test
    void teste2() {
        // arrange
        var result = new Bee1005();

        // act
        TemplateTest.exceute("0.0 7.1");

        // assert
        assertEquals("MEDIA = 4.84091", result.ex());

    }

    @Test
    void teste3() {
        //arrange 
        var result = new Bee1005();

        // act
        TemplateTest.exceute("10.0 10.0");

        // assert
        assertEquals("MEDIA = 10.00000", result.ex());
        
    }
    
}