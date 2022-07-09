/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class TransporteMaritimo extends Transporte{
    
    private String cooperativaMaritimo;
    
    public void establecerCooperativaAvion(String d){
        cooperativaMaritimo = d;
    }
    
    @Override
    public void establecerTarifa(){
        tarifa = 500 * 0.9;
    }
    
    public String obtenerCooperativaAvion(){
        return cooperativaMaritimo;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Transporte Maritimo: $%.2f\n", 
                tarifa);
        return cadena;
    }
    
}
