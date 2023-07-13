package com.mycompany.tallerpatrones.decorators;

import com.mycompany.tallerpatrones.reportes.Report;


public abstract class ReportDecorator implements Report {
    protected Report decoratedReport;

    public ReportDecorator(Report decoratedReport) {
        this.decoratedReport = decoratedReport;
    }

    @Override
    public void generate() {
        decoratedReport.generate();
    }
}