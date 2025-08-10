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
        // Assert
        assertEquals("Hello World!", response);
    }
    @Test
    public void testHi() {
        // Act
        String response = controller.hi("John");
        // Assert
        assertEquals("Hi John!", response);
    }
    @Test
    public void testIndex() {
        // Act
        String response = controller.index();
        // Assert
        assertEquals("Welcome to the Hello World application!", response);
    }
}
