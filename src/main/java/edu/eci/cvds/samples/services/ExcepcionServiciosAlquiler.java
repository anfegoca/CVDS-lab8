/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.samples.services;

import edu.eci.cvds.sampleprj.dao.PersistenceException;

/**
 *
 * @author andres.gonzalez-ca
 */
public class ExcepcionServiciosAlquiler extends Exception {

    public ExcepcionServiciosAlquiler(String string, PersistenceException ex) {
        super(string);
    }
    public ExcepcionServiciosAlquiler(String string) {
        super(string);
    }
    
}
