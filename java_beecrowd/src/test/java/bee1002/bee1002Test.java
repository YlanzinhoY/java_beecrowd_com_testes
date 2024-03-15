package bee1002;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import com.ylanzinhoy.github.TemplateTest;
import com.ylanzinhoy.github.bee1002.Bee1002;

public class bee1002Test {


    @Test
    void ex() {
        assertAll("Fazendo os 3 testes que pede o bee1002", () ->{
            assertAll("teste 1", () -> {
                TemplateTest.exceute("100.64");
                var result2 = Bee1002.ex(); 
                assertEquals("A=31819.3103", result2);
            });

            assertAll("teste 2", () -> {
                TemplateTest.exceute("2.00");
                var result2 = Bee1002.ex(); 
                assertEquals("A=12.5664", result2);
            });

            assertAll("teste 3", () -> {
                TemplateTest.exceute("150.00");
                var result2 = Bee1002.ex(); 
                assertEquals("A=70685.7750", result2);
            });
        }
        );
    }
    
}
