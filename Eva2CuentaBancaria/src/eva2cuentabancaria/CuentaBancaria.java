/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2cuentabancaria;

/**
 *
 * @author dam115
 */
public class CuentaBancaria {
    private String titular;
    private int numeroDeCuenta;
    private double tipoDeInteres;
    private double saldo;

    public CuentaBancaria(String titular, int numeroDeCuenta, double saldo) {
        this.titular = titular;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular, int numeroDeCuenta) {
        this.titular = titular;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }
    
    public void ingresarDinero(double ingreso){
        this.saldo+=ingreso;
    }
    public void retirarDinero(double cantidad){
        this.saldo-=cantidad;
    }
    @Override
    public String toString(){
        return "Titular "+this.titular+" Saldo "+this.saldo+" ";
    }
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(this.getClass() !=obj.getClass()){
            return false;
        }
        final CuentaBancaria miCuenta = (CuentaBancaria) obj;
        return miCuenta.titular.equals(this.titular);
    }
}
