/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class TransporteAereo extends Transporte{
    
    private String cooperativaAvion;
    
    public void establecerCooperativaAvion(String d){
        cooperativaAvion = d;
    }
    
    @Override
    public void establecerTarifa(){
        tarifa = 100 * 0.2;
    }
    
    public String obtenerCooperativaAvion(){
        return cooperativaAvion;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Transporte aereo: $%.2f\n", 
                tarifa);
        return cadena;
    }
}
