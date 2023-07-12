/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones.reportes;

/**
 *
 * @author CltControl
 */
public class ExcelReport implements Report{
    @Override
    public void generate() {
        System.out.println("Generando reporte.xls");
    }
}
