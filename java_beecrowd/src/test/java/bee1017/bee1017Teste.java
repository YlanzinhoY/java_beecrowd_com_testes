package bee1017;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import com.ylanzinhoy.github.TemplateTest;
import com.ylanzinhoy.github.bee1017.Bee1017;

public class bee1017Teste {
    

    @Test
    void teste1() {
        var bee1017 = new Bee1017();

        // act
        TemplateTest.exceute("10 85");

         // assert
        assertEquals("70.833", bee1017.ex());
    }

}
