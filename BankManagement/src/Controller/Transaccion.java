package Controller;

import java.util.ArrayList;
import java.util.List;

public class Transaccion {
    private double monto;
    private String cuentaOrigen;
    private String cuentaDestino;
    private static List<Transaccion> historialTransacciones = new ArrayList<>();

    public Transaccion(double monto, String cuentaOrigen, String cuentaDestino) {
        this.monto = monto;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        registrarTransaccion(this);
    }

    public Transaccion(double monto, String cuentaOrigen) {
        this.monto = monto;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = null;
        registrarTransaccion(this);
    }

    private static void registrarTransaccion(Transaccion transaccion) {
        historialTransacciones.add(transaccion);
    }

    public static List<Transaccion> obtenerHistorialTransacciones() {
        return historialTransacciones;
    }

    // Getters y setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
}


