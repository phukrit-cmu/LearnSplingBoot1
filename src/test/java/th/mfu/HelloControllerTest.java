package th.mfu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloControllerTest {

    @Autowired
    private HelloController controller;

    @Test
    public void testHello() {

        // Act
        String response = controller.hello();
        String indexResponse = controller.index();
        // Assert
        assertEquals("Hello World!", response);
        assertEquals("Welcome to the Hello World application!", indexResponse);
    }

    @Test
    public void testHi() {
        // Act
        String response = controller.hi("John");
        // Assert
        assertEquals("Hi John!", response);
    }
}
