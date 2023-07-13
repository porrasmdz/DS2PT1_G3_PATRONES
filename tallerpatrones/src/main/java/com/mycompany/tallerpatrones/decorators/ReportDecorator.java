package com.mycompany.tallerpatrones.decorators;


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