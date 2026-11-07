/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ArchivoDescarga;

/**
 *
 * @author Diego Calix
 */
public class DescargaController {

    public void iniciarDescarga(String nombreArchivo, int tiempoLimite) {

        ArchivoDescarga archivo = new ArchivoDescarga(
                nombreArchivo,
                tiempoLimite
        );

        archivo.iniciarDescarga();
    }
}
