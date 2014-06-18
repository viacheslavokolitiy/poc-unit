package ua.dev.poc.reporting;

import java.io.IOException;

public class ReportingStrategyContext {

    private ReportingStrategy mReportingStrategy;

    public ReportingStrategyContext() {
    }

    public ReportingStrategy getReportingStrategy() {
        return mReportingStrategy;
    }

    public void setReportingStrategy(ReportingStrategy mReportingStrategy) {
        this.mReportingStrategy = mReportingStrategy;
    }

    public void report(String message){
        mReportingStrategy.report(message);
    }

    public void successReporting(boolean testCondition){
        mReportingStrategy.success(testCondition);
    }

    public void failureReporting(boolean testCondition){
        mReportingStrategy.failure(testCondition);
    }
}
