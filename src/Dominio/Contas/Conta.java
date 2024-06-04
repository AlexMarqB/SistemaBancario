package Dominio.Contas;

import Dominio.Cliente;

public class Conta {

    private Cliente cliente;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {}

    public Conta(Cliente cliente, int agencia, int numero, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
