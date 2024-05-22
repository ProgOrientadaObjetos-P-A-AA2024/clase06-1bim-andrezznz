package paquete4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Formatter;
import paquete4.Empresa;
import java.util.ArrayList;
import java.util.Formatter;

public class ArchivoEscritura {
    
    private String nombreArchivo;
    private String rutaArchivo;
    private Empresa empresa;
    private Formatter salidaArchivo;

    public ArchivoEscritura(String n) {
        
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s",
                nombreArchivo);
        
    }

    
    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());
    }

    public void establecerRegistro(Empresa n) {
        empresa = n;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public Empresa obtenerRegistro() {
        return empresa;
    }

    public void establecerSalida() {
        try {
            salidaArchivo = new Formatter(new FileWriter(rutaArchivo, true));
            Empresa p = obtenerRegistro();
            String cadenaNombre = String.format("%s;%s",
                    p.obtenerNombre(),
                    p.obtenerCiudad());
            salidaArchivo.format("%s\n", cadenaNombre);
            salidaArchivo.close();
        } catch (IOException e) {
            System.err.println("Error al crear el archivo.");
            System.err.println(e);

        }

    }

    public void cerrarArchivo() {
        if (salidaArchivo != null) {
            salidaArchivo.close();
        } // cierra el archivo

    }
    
    
}
