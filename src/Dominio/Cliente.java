package Dominio;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public Cliente() {};

    public Cliente(String nome, String cpf, String email, String telefone) {}

    public void abrirContaCorrente(Banco banco) {
        banco.criarContaCorrente(nome);
    }

    public void fecharContaCorrente(Banco banco) {
         banco.criarContaPoupança(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
