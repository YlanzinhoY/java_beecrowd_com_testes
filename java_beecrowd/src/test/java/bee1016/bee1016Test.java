package bee1016;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ylanzinhoy.github.TemplateTest;
import com.ylanzinhoy.github.bee1016.Bee1016;

public class bee1016Test {
    

    @Test
    void teste1() {
        // arrange
        var bee10016 = new Bee1016();

        // act
        TemplateTest.exceute("30");

        // assert
        assertEquals("60 minutos", bee10016.ex());

    }

    @Test
    void teste2() {
        // arrange
        var bee10016 = new Bee1016();

        // act
        TemplateTest.exceute("110");

        // assert
        assertEquals("220 minutos", bee10016.ex());

    }

    @Test
    void teste3() {
        // arrange
        var bee10016 = new Bee1016();

        // act
        TemplateTest.exceute("7");

        // assert
        assertEquals("14 minutos", bee10016.ex());

    }
    
}
