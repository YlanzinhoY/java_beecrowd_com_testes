package bee1003;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ylanzinhoy.github.TemplateTest;
import com.ylanzinhoy.github.bee1003.Bee1003;

public class bee1003Test {
    
    @Test
    void ex() {
        assertAll("3 testes bee1003",
         () -> assertAll( "testes",
            () -> {
                TemplateTest.exceute("30 10");
                Bee1003 result = new Bee1003();
                assertEquals("SOMA = 40", result.ex());
            },
            () -> {
                TemplateTest.exceute("-30 10");
                var result = new Bee1003();
                assertEquals("SOMA = -20", result.ex());
            },
            () -> {
                TemplateTest.exceute("0 0");
                var result = new Bee1003();
                assertEquals("SOMA = 0", result.ex());
            }
            )
        );
    }
}
