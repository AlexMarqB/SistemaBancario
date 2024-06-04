package Dominio.Contas;


import Dominio.Banco;
import Dominio.Cliente;

public class ContaCorrente extends Conta{

    public void sacar(double valor){
        if (getSaldo() < valor) {
            System.out.println("Saldo insuficiente");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Sacou R$" + valor);
            System.out.println("Saldo atual: " + getSaldo());
        }
    }

    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
        System.out.println("DEPOSITO R$" + valor);
        System.out.println("Saldo atual: " + getSaldo());
    }

    public void transferir(double valor, Conta destino){
        destino.setSaldo(destino.getSaldo() + valor);
        setSaldo(getSaldo() - valor);
        System.out.println("Transferiu R$" + valor + " para " + destino);
        System.out.println("Saldo atual: " + getSaldo());
    }

    public ContaCorrente() {
    }

    public ContaCorrente(Cliente cliente, int agencia, int numero, double saldo) {
        super(cliente, agencia, numero, saldo);
    }
}
