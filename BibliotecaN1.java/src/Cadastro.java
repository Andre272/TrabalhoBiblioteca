public class Cadastro {

// VARIAVEIS
 public String nome, cpf;
public double valor;
public double resultado;

public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }

    public double getFrete() {
        return this.frete;
    }


    public String toString() {
        return this.nome + "\n" + 
               this.cpf + "\n" + 
               this.parcelas + "\n" +
               this.valor + "\n" +
               this.opcao + "\n" +
               this.pular + "\n" +
               this.estado + "\n" +
               this.frete + "\n" +
               this.resultado;

    }
}