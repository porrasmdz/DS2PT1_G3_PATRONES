package com.mycompany.tallerpatrones.decorators;

public class FontStyleDecorator extends ReportDecorator {
    public FontStyleDecorator(Report decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void generate() {
        decoratedReport.generate();
        setFontStyle();
    }

    private void setFontStyle() {
        System.out.println("Setting font style...");
    }
}
