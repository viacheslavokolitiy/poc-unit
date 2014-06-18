package ua.dev.poc;

import java.io.IOException;

public interface TestStatus {

    void fail(String message) throws IOException;

    void success(String message) throws IOException;
}
