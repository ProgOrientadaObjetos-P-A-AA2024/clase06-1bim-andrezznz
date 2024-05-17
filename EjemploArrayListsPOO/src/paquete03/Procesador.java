package paquete03;

public class Procesador {
    
    private String marca;
    private double costo;
    
    public Procesador(String n, double a) { // Constructor

        marca = n;
        costo = a;

    }
    
    
    public void establecerMarcaProcesador(String  n) {
        
        marca = n;
        
    }
    
    public void establecerCostoProcesador(double n) {
        
        costo = n;
        
    }
    
    public String obtenerMarcaProcesador() {
        
        return marca;
        
    }
    
    public double obtenerCostoProcesador() {
        
        return costo;
        
    }
}
