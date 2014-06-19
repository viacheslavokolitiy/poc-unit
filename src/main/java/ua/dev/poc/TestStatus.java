package ua.dev.poc;

import java.io.IOException;

public interface TestStatus {

    /**
     * Sends a test status message if test failed
     * @param message report message
     */
    void fail(String message);

    /**
     * Sends a test status message if test passes
     * @param message report message
     */
    void success(String message);
}
