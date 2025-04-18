package com.ieee.pdfchecker.reports;

import java.util.ArrayList;
import java.util.List;

public class ComplianceReport {
    private String fileName;
    private List<String> errors;
    private List<String> infoMessages;
    private List<ComplianceItem> items;

    // ✅ Real boolean flags
    private boolean abstractPresent;
    private boolean fontCompliant;
    private boolean columnFormatCompliant;
    private boolean keywordsPresent;
    private boolean authorDetailsCompliant;
    private boolean checkIntroPresenceValid;
    private boolean pageSizeCompliant; // ✅ ADDED

    public ComplianceReport(String fileName) {
        this.fileName = fileName;
        this.errors = new ArrayList<>();
        this.infoMessages = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public void addError(String error) {
        errors.add(error);
        items.add(new ComplianceItem("fail", extractRule(error), error));
    }

    public void addInfo(String info) {
        infoMessages.add(info);
        items.add(new ComplianceItem("pass", extractRule(info), info));
    }

    private String extractRule(String msg) {
        msg = msg.toLowerCase();
        if (msg.contains("abstract")) return "Abstract";
        if (msg.contains("font") || msg.contains("typeface")) return "Font";
        if (msg.contains("introduction")) return "Introduction";
        if (msg.contains("author")) return "Author";
        if (msg.contains("column")) return "Column Format";
        if (msg.contains("keyword")) return "Keywords";
        if (msg.contains("page size") || msg.contains("incorrect size")) return "Page Size";

        return "General";
    }

    public boolean isCompliant() {
        return errors.isEmpty();
    }

    public String getFileName() {
        return fileName;
    }

    public List<String> getErrors() {
        return errors;
    }

    public List<String> getInfoMessages() {
        return infoMessages;
    }

    public List<ComplianceItem> getItems() {
        return items;
    }

    public boolean isAbstractPresent() {
        return abstractPresent;
    }

    public void setAbstractPresent(boolean abstractPresent) {
        this.abstractPresent = abstractPresent;
    }

    public boolean isFontCompliant() {
        return fontCompliant;
    }

    public void setFontCompliant(boolean fontCompliant) {
        this.fontCompliant = fontCompliant;
    }

    public boolean isColumnFormatCompliant() {
        return columnFormatCompliant;
    }

    public void setColumnFormatCompliant(boolean columnFormatCompliant) {
        this.columnFormatCompliant = columnFormatCompliant;
    }

    public boolean isKeywordsPresent() {
        return keywordsPresent;
    }

    public void setKeywordsPresent(boolean keywordsPresent) {
        this.keywordsPresent = keywordsPresent;
    }

    public boolean isAuthorDetailsCompliant() {
        return authorDetailsCompliant;
    }

    public void setAuthorDetailsCompliant(boolean authorDetailsCompliant) {
        this.authorDetailsCompliant = authorDetailsCompliant;
    }

    public boolean ischeckIntroPresenceValid() {
        return checkIntroPresenceValid;
    }

    public void setcheckIntroPresenceValid(boolean checkIntroPresenceValid) {
        this.checkIntroPresenceValid = checkIntroPresenceValid;
    }


    public boolean isPageSizeCompliant() {
        return pageSizeCompliant;
    }

    public void setPageSizeCompliant(boolean pageSizeCompliant) {
        this.pageSizeCompliant = pageSizeCompliant;
    }
}
