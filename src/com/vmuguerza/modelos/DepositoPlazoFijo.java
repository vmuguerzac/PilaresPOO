package com.vmuguerza.modelos;

public class DepositoPlazoFijo extends ProductoBancario {
    private int plazoDias;
    
    @Override
    public double calcularRendimiento() {
        double tasa = plazoDias >= 360 ? 0.06 : 0.035;
        return montoBase * tasa;
    }

    public int getPlazoDias() {
        return plazoDias;
    }
    public void setPlazoDias(int plazoDias) {
        this.plazoDias = plazoDias;
    }
    
}
