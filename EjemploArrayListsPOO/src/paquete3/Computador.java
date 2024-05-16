package paquete3;

public class Computador {
    
   private String marca;
   private Procesador procesador;
   private Memoria memoria;
   private double costoComputador;

   public void establecerMarca(String  n) {
        
        marca = n;
        
    }
    
    public void establecerProcesador(Procesador n) {
        
        procesador = n;
        
    }
    
    public void establecerMemoria(Memoria n) {
        
        memoria = n;
        
    }
    
    public void calcularComputador() {
        
       costoComputador = memoria.obtenerCosto() + procesador.obtenerCosto();
        
    }
    
    public String obtenerMarca() {
        
        return marca;
        
    }
    
    public Procesador obtenerProcesaro() {
        
        return procesador;
        
    }
    
    public Memoria obtenerMemoria() {
        
        return memoria;
        
    }
    
    public double obtenerCalcularComputador() {
        
        return costoComputador;
        
    }
}
