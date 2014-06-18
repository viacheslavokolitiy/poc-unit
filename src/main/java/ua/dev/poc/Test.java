package ua.dev.poc;

import java.io.IOException;
import java.util.List;

/**
 * Created by 1 on 18.06.2014.
 */
public interface Test {

    void assertNotNull(String message, Object value);

    void assertTrue(String message, boolean condition);

    void assertListEquals(String message, List<?> expected, List<?> actual);

    void assertEquals(String message, String expected, String actual);

    void assertEquals(String message, double expected, double actual);

    void assertEquals(String message, float expected, float actual);

    void assertEquals(String message, long expected, long actual);

    void assertEquals(String message, short expected, short actual);

    void assertEquals(String message, char expected, char actual);

    void assertEquals(String message, byte expected, byte actual);
}
