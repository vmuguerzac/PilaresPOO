package com.vmuguerza.modelos;

public class CuentaAhorros extends ProductoBancario {

    @Override
    public double calcularRendimiento() {
        return montoBase * 0.025; // tasa anual
    }
    
}
