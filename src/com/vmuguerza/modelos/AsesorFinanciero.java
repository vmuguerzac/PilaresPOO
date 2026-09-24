package com.vmuguerza.modelos;

public class AsesorFinanciero extends EmpleadoBCP {
    private double ventasDelMes;
    private static final double COMISION = 0.03;

    public AsesorFinanciero(String nombre, double sueldoBase, double ventasDelMes) {
        super(nombre, sueldoBase);
        this.ventasDelMes = ventasDelMes;
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + (ventasDelMes * COMISION);
    }

    
}
