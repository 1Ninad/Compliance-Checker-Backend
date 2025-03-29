package com.ieee.pdfchecker.reports;

public class ComplianceItem {
    private String status;  // "pass", "fail"
    private String rule;
    private String message;

    public ComplianceItem(String status, String rule, String message) {
        this.status = status;
        this.rule = rule;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getRule() {
        return rule;
    }

    public String getMessage() {
        return message;
    }
}
