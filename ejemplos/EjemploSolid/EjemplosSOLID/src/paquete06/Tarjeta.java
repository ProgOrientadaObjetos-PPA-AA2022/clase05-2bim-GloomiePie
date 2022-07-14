/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
public class Tarjeta {
    
    private String nombreB;
    private double cupoM;
    
    public Tarjeta(String n, double c){
        nombreB = n;
        cupoM = c;
        
    }
    
    public void establecerNombreB(String d){
        nombreB = d;
    }
    
    public void establecerCupoM(double d){
        cupoM = d;
    }
    
    public String obtenerNombreB(){
        return nombreB;
    }
    
    public double obtenerCupoM(){
        return cupoM;
    }
    
    @Override
    public String toString(){
      return String.format("Nombre del banco: %s\n"
              + "Cupo maximo: %.2f\n", nombreB, cupoM);  
    }
    
}
