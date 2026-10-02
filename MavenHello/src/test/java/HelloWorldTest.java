import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    void testMessage() {
        String message = "Hello, Maven!";
        assertEquals("Hello, Maven!", message);
    }
}