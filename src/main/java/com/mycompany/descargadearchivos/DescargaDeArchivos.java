/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.descargadearchivos;

import controlador.DescargaController;

/**
 *
 * @author Diego Calix
 */
public class DescargaDeArchivos {

    public static void main(String[] args) {
        DescargaController controller = new DescargaController();

        controller.iniciarDescarga("archivo.txt", 5);
    }
}

