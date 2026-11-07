/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Diego Calix
 */

public class TiempoExcedidoException extends Exception {

    private double tiempoExcedido;

    public TiempoExcedidoException(String mensaje, double tiempoExcedido) {
        super(mensaje);
        this.tiempoExcedido = tiempoExcedido;
    }

    public double getTiempoExcedido() {
        return tiempoExcedido;
    }
}

