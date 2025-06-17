package homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HomeWorkTest {

    @Test
    public void safeDivide() {
        Assertions.assertEquals(2, HomeWork.safeDivide(2, 1));
    }

    @Test
    public void safeDivideNull() {
        Assertions.assertNull(HomeWork.safeDivide(2, 0));
    }

    @Test
    public void validateString() {
        String str = "";
        assertThrows(IllegalArgumentException.class, () -> HomeWork.validateString(str));
    }

    @Test
    public void convertStrToNum() {
        List<Integer> testList = HomeWork.convertStrToNum(List.of("10", "abc", "5"));
        Assertions.assertEquals(List.of(10, 5), testList);
    }


}