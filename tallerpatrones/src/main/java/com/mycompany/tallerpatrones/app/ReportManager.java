/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones.app;

import com.mycompany.tallerpatrones.fabricas.PDFReportFactory;
import com.mycompany.tallerpatrones.fabricas.ReportFactory;
import com.mycompany.tallerpatrones.reportes.Report;

/**
 *
 * @author CltControl
 */
public final class ReportManager {
    //Instancia privada del singleton
    private static ReportManager instance;
    
    private ReportFactory fabrica;
    private Report reporte;
    
    //Constructor privado del singleton
    private ReportManager(ReportFactory fabrica) {
        this.fabrica = fabrica;
        this.reporte = fabrica.createReport();
    }
   
    public static ReportManager getInstance(ReportFactory fabrica) {
        if (instance == null) {
            //Fabrica por defecto es fabrica de pdfs
            instance = new ReportManager(fabrica);
        }
        instance.setFabrica(fabrica);
        return instance;
    }
    
    
    //Getters and setters
    public Report getReporteActual() {
        return reporte;
    }

    public void setReporteActual(Report reporte) {
        this.reporte = reporte;
    }

    public ReportFactory getFabrica() {
        return fabrica;
    }

    public void setFabrica(ReportFactory fabrica) {
        this.fabrica = fabrica;
    }

   
    
    
    
}
