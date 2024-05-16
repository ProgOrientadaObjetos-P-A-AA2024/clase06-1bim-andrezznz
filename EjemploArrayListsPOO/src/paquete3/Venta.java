package paquete3;

import java.util.ArrayList;

public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;
    
    public Venta(ArrayList<Computador> c) {
        
        computadoras = c;
        
    }
    
    
    public void establecerComputadoras(ArrayList<Computador>  n) {
        
        computadoras = n;
        
    }
    
    public void calcularValorVenta() {

        double suma = 0;
        
        for (int i = 0; i < computadoras.size(); i++) {
            
            suma = (int) (suma + computadoras.get(i).obtenerCalcularComputador());
            
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
        
        String cadena;
        
        cadena = String.format("%s\n%s\n%.2f", 
                obtenerComputadora(), obtenerValorVenta());
        
        return cadena;
    }
    
    
}
