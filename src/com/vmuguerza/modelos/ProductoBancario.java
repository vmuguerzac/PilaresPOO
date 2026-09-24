package com.vmuguerza.modelos;

public abstract class ProductoBancario {
    protected String numeroProducto;
    protected double montoBase;

    //Metodo abstracto: cada producto DEBE definir su propia funcionalidad
    public abstract double calcularRendimiento();

    // Metodo concreto: logica compartida
    public void mostrarResumen(){
        System.out.println(numeroProducto + " | Rendimiento S/ " + calcularRendimiento());
    }

    public String getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(String numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public double getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(double montoBase) {
        this.montoBase = montoBase;
    }
    
}
