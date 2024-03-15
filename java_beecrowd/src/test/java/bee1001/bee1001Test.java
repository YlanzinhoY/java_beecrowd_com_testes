package bee1001;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

import com.ylanzinhoy.github.TemplateTest;
import com.ylanzinhoy.github.bee1001.Bee1001;


public class bee1001Test {
    
    @Test
    void simulate() {
        assertAll("bee1001", () -> {

            assertAll("teste 1", () -> {
                TemplateTest.exceute("10 9");
                var result = Bee1001.ex();
                assertEquals("X = 19", result);
            });

            assertAll("teste 1", () -> {
                TemplateTest.exceute("-10 4");
                var result = Bee1001.ex();
                assertEquals("X = -6", result);
            });

            assertAll("teste 1", () -> {
                TemplateTest.exceute("15 -7");
                var result = Bee1001.ex();
                assertEquals("X = 8", result);
            });
        });
    }
}
