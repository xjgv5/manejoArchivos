package com.xjgv.archivos.ejemplos.service;

import java.io.*;

public class ArchivoServicio {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true));) {

            buffer.append("Prueba de escritura")
                    .append("\n")
                    .append("Prueba terminada");
            //buffer.close();
            System.out.println("El archivo se ha creado con exito! ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try(PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true));) {

            buffer.println("Prueba de escritura");
            buffer.println("Prueba terminada");
            //buffer.close();
            System.out.println("El archivo se ha creado con exito! ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
