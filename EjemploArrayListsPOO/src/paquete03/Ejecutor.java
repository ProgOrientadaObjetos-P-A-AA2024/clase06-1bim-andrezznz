package paquete03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        ArrayList<Computador> compus = new ArrayList<>();
        
        int pc;
        String marcaPC, marcaPRO, marcaME;
        double costoPRO, costoME;
        
        System.out.println(" Ingrese el Numero De PC'S a Comprar:       ");
        pc = leer.nextInt();
        
        System.out.println("--------------------------------------");
        
        leer.nextLine();
        
        for (int i = 0; i < pc; i++) {
            
            System.out.print(" Marca De La PC:      ");
            marcaPC = leer.nextLine();
            
            System.out.print(" Marca Del Procesador:     ");
            marcaPRO = leer.nextLine();
            
            System.out.print(" Costo Del Procesador:     ");
            costoPRO = leer.nextDouble();
            
            leer.nextLine();
            Procesador pro1 = new Procesador(marcaPRO, costoPRO);
            
            System.out.print(" Marca De La Memoria:     ");
            marcaME = leer.nextLine();
            
            System.out.print(" Costo De La Memoria:     ");
            costoME = leer.nextDouble();
            
            Memoria me1 = new Memoria(marcaME, costoME);
            
            Computador com = new Computador(marcaPC, pro1, me1);
            com.obtenerCalcularComputador();
            compus.add(com);
            
            leer.nextLine();
        }
        
        Venta venta1 = new Venta();
        venta1.establecerComputadoras(compus);
        venta1.calcularValorVenta();
        
        System.out.printf(" %s\n ", venta1);
        
    }
}
