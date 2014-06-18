package ua.dev.poc;

import ua.dev.poc.reporting.ConsoleReport;
import ua.dev.poc.reporting.ReportingStrategyContext;

import java.io.IOException;
import java.util.List;

public class TestCase implements Test, TestStatus {
    private final ReportingStrategyContext reportingStrategyContext = new ReportingStrategyContext();

    @Override
    public void assertNotNull(String message, Object value){
         if(value != null){
              assertTrue(message, value != null);
         } else {
             fail(message);
         }
    }

    public void assertNotNull(Object value){
        assertNotNull("Test ", value);
    }

    @Override
    public void assertTrue(String message, boolean condition){
        if(!condition){
           fail(message);
        }

        success(message);
    }

    @Override
    public void assertListEquals(String message, List<?> expected, List<?> actual) {
        if(expected.size() == actual.size() && expected.containsAll(actual)){
            success(message);
        } else {
            fail(message);
        }
    }

    @Override
    public void assertEquals(String message, String expected, String actual){
        if(expected.equals(actual)){
            success(message);
        }

        fail(message);
    }

    @Override
    public void assertEquals(String message, double expected, double actual) {
        if(Double.compare(expected, actual) == 0){
            success(message);
        } else {
            fail(message);
        }
    }

    @Override
    public void assertEquals(String message, float expected, float actual) {
        if(Float.compare(expected,actual) == 0){
            success(message);
        } else {
            fail(message);
        }
    }

    @Override
    public void assertEquals(String message, long expected, long actual) {
        if(Long.valueOf(expected).compareTo(actual) == 0){
            success(message);
        } else {
            fail(message);
        }
    }

    @Override
    public void assertEquals(String message, short expected, short actual) {
        if(Short.valueOf(expected).compareTo(actual) == 0){
            success(message);
        } else {
            fail(message);
        }
    }

    @Override
    public void assertEquals(String message, char expected, char actual) {
        if(Character.valueOf(expected).compareTo(actual) == 0){
            success(message);
        } else {
            fail(message);
        }
    }

    @Override
    public void assertEquals(String message, byte expected, byte actual) {
        if(Byte.valueOf(expected).compareTo(actual) == 0){
            success(message);
        } else {
            fail(message);
        }
    }


    @Override
    public void fail(String message){
        reportingStrategyContext.setReportingStrategy(new ConsoleReport());
        reportingStrategyContext.failureReporting(true);
        reportingStrategyContext.report(message);
    }

    @Override
    public void success(String message){
        reportingStrategyContext.setReportingStrategy(new ConsoleReport());
        reportingStrategyContext.successReporting(true);
        reportingStrategyContext.report(message);
    }
}
