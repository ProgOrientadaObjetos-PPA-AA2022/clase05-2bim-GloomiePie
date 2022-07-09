/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author SALA I
 */
public class TransporteAereo {
    
    private String cooperativaAvion;
    private double tarifa;
    
    
    public void establecerTarifa(){
        tarifa = 100 * 0.2;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
    public void establecerCooperativaAvion(String d){
        cooperativaAvion = d;
    }
    
    public String obtenerCooperativaAvion(){
        return cooperativaAvion;
    }
    
    
    
}
