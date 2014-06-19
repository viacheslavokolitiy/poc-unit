package ua.dev.poc.reporting;

public class ConsoleReport implements ReportingStrategy {
    private boolean isSuccess;
    private boolean isFailure;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean isFailure() {
        return isFailure;
    }

    public void setFailure(boolean isFailure) {
        this.isFailure = isFailure;
    }

    @Override
    public void report(String message) {
        if(message != null && isSuccess()){
            System.out.println(message + " SUCCESS");
        } else if(message != null && isFailure()){
            System.out.println(message + " FAILED");
        }
    }

    @Override
    public void failure(boolean condition) {
        setFailure(condition);
    }

    @Override
    public void success(boolean condition) {
       setSuccess(condition);
    }
}
