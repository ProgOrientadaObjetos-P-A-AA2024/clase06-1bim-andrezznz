/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class Profesor{
    private String nombre;
    private String tipo;
    
    public Profesor(String n, String t){
        nombre = n;
        tipo = t;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerTipo(String n){
        tipo = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public String toString(){
        return String.format("%s - %s", nombre, tipo);
        
        // return String.format("%s - %s", obtenerNombre(), 
        //         obtenerTipo());
        
        // return String.format("%s - %s", obtenerNombre(), tipo);
    }
}









