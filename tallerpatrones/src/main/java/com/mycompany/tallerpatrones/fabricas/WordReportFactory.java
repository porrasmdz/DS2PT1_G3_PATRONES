/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones.fabricas;

import com.mycompany.tallerpatrones.reportes.*;

/**
 *
 * @author CltControl
 */
public class WordReportFactory implements ReportFactory{

    @Override
    public Report createReport() {
        return new WordReport();
    }
}
