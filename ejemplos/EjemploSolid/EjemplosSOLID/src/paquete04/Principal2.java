/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Principal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Elija un tipo de transporte\n"
                + "1) Transporte bus\n"
                + "2) Transporte taxi\n"
                + "3) Transporte aereo\n"
                + "4) Transporte Maritimo\n");
        int opcion = sc.nextInt();
        ArrayList lista = new ArrayList();
        TransporteBus bus = new TransporteBus();
        TransporteTaxi taxi = new TransporteTaxi();
        TransporteAereo aereo = new TransporteAereo();
        TransporteMaritimo maritimo = new TransporteMaritimo();

        switch (opcion) {
            case 1:

                bus.establecerCooperativaBus("24 Mayo");
                bus.establecerTarifa();
                lista.add(bus);
                break;

            case 2:

                taxi.establecerCooperativaTaxi("Yahuarcuna");
                taxi.establecerTarifa();
                lista.add(taxi);
                break;

            case 3:

                aereo.establecerTarifa();
                lista.add(aereo);
                break;

            case 4:

                maritimo.establecerTarifa();
                lista.add(maritimo);
                break;

        }

        System.out.println("¿Desea agregar otro transporte?\n"
                + "1) Si\n"
                + "2) No\n");
        int opcion2 = sc.nextInt();

        if (opcion2 == 1) {
            while (opcion2 < 2) {
                System.out.printf("Elija un tipo de transporte\n"
                        + "1) Transporte bus\n"
                        + "2) Transporte taxi\n"
                        + "3) Transporte aereo\n"
                        + "4) Transporte Maritimo\n");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        bus.establecerCooperativaBus("24 Mayo");
                        bus.establecerTarifa();
                        lista.add(bus);
                        break;

                    case 2:
                        taxi.establecerCooperativaTaxi("Yahuarcuna");
                        taxi.establecerTarifa();
                        lista.add(taxi);
                        break;

                    case 3:
                        aereo.establecerTarifa();
                        lista.add(aereo);
                        break;

                    case 4:
                        maritimo.establecerTarifa();
                        lista.add(maritimo);
                        break;

                }
                System.out.printf("¿Desea agregar otro transporte?\n"
                        + "1) Si\n"
                        + "2) No\n");
                opcion2 = sc.nextInt();

            }
        }

        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%s", lista.get(i));
        }
        System.out.printf("Promedio de Tarifas: $%.2f\n",
                tipos.obtenerPromedioTarifas());

    }
}
