package com.theTestingacademy.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

    private int retrycount=0;
    private static final int maxretrycount=3;
    @Override
    public boolean retry(ITestResult result) {
        if(retrycount<maxretrycount)
        {
            retrycount++;
            return true;
        }
        return false;
    }
}
