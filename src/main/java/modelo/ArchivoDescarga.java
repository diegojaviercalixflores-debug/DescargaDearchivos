/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import excepciones.TiempoExcedidoException;

/**
 *
 * @author Diego Calix
 */
public class ArchivoDescarga {

    private String nombreArchivo;
    private int tiempoLimite;

    public ArchivoDescarga(String nombreArchivo, int tiempoLimite) {
        this.nombreArchivo = nombreArchivo;
        this.tiempoLimite = tiempoLimite;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public int getTiempoLimite() {
        return tiempoLimite;
    }
    
    public void iniciarDescarga() {
    ProcesoDescargaHilo proceso = new ProcesoDescargaHilo(this);
    Thread hilo = new Thread(proceso);
    hilo.start();
}
}

class ProcesoDescargaHilo implements Runnable {

    private ArchivoDescarga archivo;

    public ProcesoDescargaHilo(ArchivoDescarga archivo) {
        this.archivo = archivo;
    }

    public void run() {

        System.out.println("Iniciando descarga de: "
                + archivo.getNombreArchivo());

        try {

            Thread.sleep(3000);

            if (archivo.getTiempoLimite() < 3) {

                throw new TiempoExcedidoException(
                        "El tiempo de descarga fue excedido",
                        3 - archivo.getTiempoLimite()
                );
            }

            System.out.println("Descarga completada.");

        } catch (TiempoExcedidoException e) {

            System.out.println(e.getMessage());
            System.out.println("Tiempo excedido: "
                    + e.getTiempoExcedido());

        } catch (InterruptedException e) {

            System.out.println(
                    "El proceso concurrente fue interrumpido"
            );
        }
    }
}
