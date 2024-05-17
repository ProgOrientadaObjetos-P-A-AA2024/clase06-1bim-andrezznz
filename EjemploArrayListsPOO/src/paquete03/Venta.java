package paquete03;

import java.util.ArrayList;

public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public void establecerComputadoras(ArrayList<Computador> n) {

        computadoras = n;

    }

    public void calcularValorVenta() {

        valorVenta  = 0;

        for (Computador compus : computadoras) {
            valorVenta = valorVenta + compus.obtenerCalcularComputador();
        }

    }

    public ArrayList<Computador> obtenerComputadora() {

        return computadoras;

    }

    public double obtenerValorVenta() {

        return valorVenta;

    }

    @Override
    public String toString() {

        String cadena = "\nVALOR TOTAL DE COMPUTADORAS";

        for (Computador compu : computadoras) {

            cadena = String.format("%s\n\n"
                    + "Marca Del PC:    %s\n"
                    + "Marca Del Procesador:    %s\n"
                    + "Marca De La Memoria:    %s\n"
                    + "Costo Del Procesador:    %.2f\n"
                    + "Costo De La Memoria:    %.2f\n\n"
                    + "Costo Del PC:    %.2f\n",
                    cadena,
                    compu.obtenerMarca(),
                    compu.obtenerProcesador().obtenerMarcaProcesador(),
                    compu.obtenerMemoria().obtenerMarcaMemoria(),
                    compu.obtenerProcesador().obtenerCostoProcesador(),
                    compu.obtenerMemoria().obtenerCostoMemoria(),
                    compu.obtenerCalcularComputador());
        }

        cadena = String.format("%s\n\nValor TOTAL De La Venta:     %.2f\n", 
                cadena,
                obtenerValorVenta());

        return cadena;
    }
}
