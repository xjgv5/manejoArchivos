package com.xjgv.archivos.ejemplos.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicio {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo, true);
            escritor.append("Prueba de escritura")
                    .append("\n")
                    .append("Prueba terminada");
            escritor.close();
            System.out.println("El archivo se ha creado con exito! ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
