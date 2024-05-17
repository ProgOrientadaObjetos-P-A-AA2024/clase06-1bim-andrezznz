package paquete03;

public class Computador {
    
   private String marca;
   private Procesador procesador;
   private Memoria memoria;
   private double costoComputador;
   
   public Computador(String n, Procesador p, Memoria m) {
       
       marca = n;
       procesador = p;
       memoria = m;
       calcularComputador();
   }

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
        
       costoComputador = memoria.obtenerCostoMemoria() + procesador.obtenerCostoProcesador();
        
    }
    
    public String obtenerMarca() {
        
        return marca;
        
    }
    
    public Procesador obtenerProcesador() {
        
        return procesador;
        
    }
    
    public Memoria obtenerMemoria() {
        
        return memoria;
        
    }
    
    public double obtenerCalcularComputador() {
        
        return costoComputador;
        
    }
}
