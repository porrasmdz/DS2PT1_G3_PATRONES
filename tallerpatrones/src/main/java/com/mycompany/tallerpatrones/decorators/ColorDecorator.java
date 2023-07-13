package com.mycompany.tallerpatrones.decorators;

import com.mycompany.tallerpatrones.reportes.Report;

public class ColorDecorator extends ReportDecorator {
    public ColorDecorator(Report decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void generate() {
        decoratedReport.generate();
        setColor();
    }

    private void setColor() {
        System.out.println("Setting color...");
    }
}