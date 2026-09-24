package com.vmuguerza.modelos;

public class CuentaBCP {
    private double saldo;
    private boolean bloqueada;

    public CuentaBCP(){}

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double monto) {
        if(bloqueada){
            throw new IllegalStateException("La cuenta esta bloqueada");
        }
        if(monto <= 0){
            throw new IllegalArgumentException("El valor del deposito es invalido"); 
        }
        this.saldo += monto;
    }
    public void retirar(double monto){
        if(bloqueada){
            throw new IllegalStateException("La cuenta está bloqueada");
        }
        if(monto > saldo){
            throw new IllegalArgumentException("Fondos insuficientes");
        }
        this.saldo -= monto;
    } 
}
