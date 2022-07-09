/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
     
        Persona pe = new Persona("Jose", 20);
        Persona pe2 = new Persona("Sebastian", 21);
        Persona pe3 = new Persona("Sofia", 22);
        
        ArrayList lista = new ArrayList();
        
        lista.add(pe);
        lista.add(pe2);
        lista.add(pe3);
        
        OperacionesEstudiantes op = new OperacionesEstudiantes();
        op.establecerEstudiante(lista);
        op.establecerPromedioEdadesCualitativo();
        op.establecerPromedioEdades();
        
        System.out.printf("%s\n",op); 
        
    }
}
