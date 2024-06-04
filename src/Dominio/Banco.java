package Dominio;

import Dominio.Contas.ContaCorrente;
import Dominio.Contas.ContaPoupança;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Banco {

    private String nome;
    private int agencia;
    private HashMap<String, Cliente> clienteList;
    private HashMap<Integer, ContaCorrente> contaCorrenteList;
    private HashMap<Integer, ContaPoupança> contaPoupançaList;

    public Banco() {
        contaCorrenteList = new HashMap<>();
        contaPoupançaList = new HashMap<>();
    }

    public Banco(String nome) {
        this.nome = nome;
        clienteList = new HashMap<>();
        contaCorrenteList = new HashMap<>();
        contaPoupançaList = new HashMap<>();
    }

    public void registrarCliente(String nome, String cpf, String email, String telefone) {
        Cliente cliente = new Cliente(nome, cpf, email, telefone);
        clienteList.put(nome, cliente);
    }

    public void criarContaCorrente(String nomeCliente) {
        Cliente cliente = clienteList.get(nomeCliente);
        int numero = contaCorrenteList.size() + 1;
        ContaCorrente contaCorrente = new ContaCorrente(cliente, agencia, numero, 0);
        contaCorrenteList.put(numero, contaCorrente);
        System.out.println("Conta corrente registrada com sucesso!");
        System.out.println(contaCorrente);
    }

    public void criarContaPoupança(String nomeCliente) {
        Cliente cliente = clienteList.get(nomeCliente);
        int numero = contaPoupançaList.size() + 1;
        ContaPoupança contaPoupança = new ContaPoupança(cliente, agencia, numero, 0);
        contaPoupançaList.put(numero, contaPoupança);
        System.out.println("Conta poupança registrada com sucesso!");
        System.out.println(contaPoupança);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public HashMap<String, Cliente> getClienteList() {
        return clienteList;
    }

    public HashMap<Integer, ContaCorrente> getContaCorrenteList() {
        return contaCorrenteList;
    }

    public HashMap<Integer, ContaPoupança> getContaPoupançaList() {
        return contaPoupançaList;
    }
}
