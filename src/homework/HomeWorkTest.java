package homework;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeWorkTest {

    @Test
    public void safeDivide() {
        Assertions.assertEquals(2, HomeWork.safeDivide(2, 1));
    }
}