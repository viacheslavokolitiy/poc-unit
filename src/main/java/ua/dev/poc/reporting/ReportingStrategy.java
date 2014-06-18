package ua.dev.poc.reporting;

import java.io.IOException;

public interface ReportingStrategy {

    /**
     * Reports about a test run
     * @param message message to report
     * @throws IOException
     */
    void report(String message);

    /**
     * Set failure
     * @param condition if failure was happened
     */
    void failure(boolean condition);

    /**
     * Set success
     * @param condition if success was happened
     */
    void success(boolean condition);
}
