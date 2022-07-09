/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;
    // private double edadminima;
    
    public void establecerPromedioEdadesCualitativo(){
        String co = "";
        String co2 = "";
        for (Persona e: obtenerEstudiante()) {
            if(e.obtenerEdad() <= 21){
                co = String.format("%s\n%s", co, e.obtenerNombre());
            } else {
                co2 = String.format("%s\n%s", co2, e.obtenerNombre());
            }
        }
        promedioEdadesCualitativo = String.format("Jovenes %s\n"
                + "\nMayores %s\n", co, co2);
    }
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma + e.obtenerEdad();
        }
        
        /*for (int i = 0; i < obtenerEstudiante().size(); i++) {
        suma = suma + obtenerEstudiante().get(i).obtenerEdad();
        }*/        
        promedioEdades = suma/obtenerEstudiante().size();
    }
    //<pre>  </pre>
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    
    public String obtenerPromedioEdadesCualitativo(){
        return promedioEdadesCualitativo;
    }
    
    @Override
    public String toString(){
        String cadena2 = "";
        
        for(Persona e: obtenerEstudiante()){
            cadena2 = String.format("%s\n%s\n", cadena2, e.obtenerNombre());
        }
        
        String cadena = String.format("%s\n"
                + "Promedio edad: %.2f\n"
                + "Promedio cualitativo\n"
                + "%s\n", 
                cadena2 , promedioEdades, promedioEdadesCualitativo);
        return cadena;
    }
    
}
