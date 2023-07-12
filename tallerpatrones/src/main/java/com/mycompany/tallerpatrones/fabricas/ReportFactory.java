/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tallerpatrones.fabricas;

import com.mycompany.tallerpatrones.reportes.Report;

/**
 *
 * @author CltControl
 */

//Fabrica abstracte de fabricas de reportes concretos 
public interface ReportFactory {
    
    //Creacion de reportes genericos
    Report createReport();
}
