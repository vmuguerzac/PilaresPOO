package com.vmuguerza.modelos;

public class EmpleadoBCP {
    protected String nombre;
    protected double sueldoBase;

    public EmpleadoBCP(String nombre, double sueldoBase){
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public double calcularSueldo(){
        return sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // Validaciones
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        // Validaciones
        this.sueldoBase = sueldoBase;
    }
    
    
}
