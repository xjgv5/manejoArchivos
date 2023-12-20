package com.xjgv.archivos.ejemplos;

import com.xjgv.archivos.ejemplos.service.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\Java Projects\\manejoArchivos\\archivos\\java.txt";

        ArchivoServicio servicio = new ArchivoServicio();
        servicio.crearArchivo2(nombreArchivo);
    }
}
