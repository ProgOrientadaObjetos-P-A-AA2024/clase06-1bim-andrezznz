package paquete03;

public class Memoria {

    private String marca;
    private double costo;

    public Memoria (String n, double a) {
        
        marca = n;
        costo = a;
        
    }
    
    public void establecerMarcaMarcaMemoria(String n) {

        marca = n;

    }

    public void establecerCostoMemoria(double n) {

        costo = n;

    }

    public String obtenerMarcaMemoria() {

        return marca;

    }

    public double obtenerCostoMemoria() {

        return costo;

    }

}
