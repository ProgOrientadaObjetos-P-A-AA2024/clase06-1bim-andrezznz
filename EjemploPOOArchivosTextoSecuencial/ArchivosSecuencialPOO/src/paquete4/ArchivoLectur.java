package paquete4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import paquete4.Empresa;

public class ArchivoLectur {
    
    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Empresa> lista;
    
    public ArchivoLectur(String n) {
        
        nombreArchivo = n;

        rutaArchivo = String.format("data/%s", nombreArchivo);

        try {
            entrada = new Scanner(new File(rutaArchivo));
        } // fin de try
        catch (FileNotFoundException e) {
            System.err.println("Error al leer del archivo: " + e);

        } // fin de catch

    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public void establecerLista() { // saca todas las lineas del archivo
        // los guarda en la Lista de tipo ArrayList
        lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {

            while (entrada.hasNext()) {
                String linea = entrada.nextLine(); 

                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split(";")) 
                );
                Empresa p = new Empresa(linea_partes.get(0), 
                        linea_partes.get(1)
                );
                lista.add(p);

            } // fin de while
        }
    }

    public ArrayList<Empresa> obtenerLista() {

        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

    @Override
    public String toString() {
        String cadena = "Empresa\n";
        
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena = String.format("%s(%d) %s -  %s\n", cadena, i+1,
                    obtenerLista().get(i).obtenerNombre(),
                    obtenerLista().get(i).obtenerNombre());
                    }

        return cadena;
    }
    
}
