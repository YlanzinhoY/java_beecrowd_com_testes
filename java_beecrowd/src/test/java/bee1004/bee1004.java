package bee1004;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import com.ylanzinhoy.github.TemplateTest;
import com.ylanzinhoy.github.bee1004.Bee1004;

public class bee1004 {

    @Test
    void ex() {
        assertAll("Testes bee1004", () -> {
            assertAll("testes", () -> {
                TemplateTest.exceute("3 9");
                var result = new Bee1004();
                assertEquals("PROD = 27", result.ex());
            },

            () -> {
                TemplateTest.exceute("-30 10");
                var result = new Bee1004();
                assertEquals("PROD = -300", result.ex());
            },

            () -> {
                TemplateTest.exceute("0 9");
                var result = new Bee1004();    
                assertEquals("PROD = 0", result.ex());
            }   
            );
        });
    }
    
}
