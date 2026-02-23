package exercicio01;

public class Conta {
    // atributos ou propriedades ou variáveis de instância
    String correntista;
    int numeroConta;
    double saldo;

    //Método para depositar um valor na conta
    public void depositar(double valor){
        saldo += valor;
    }

    //método para sacar um valor da conta
    public void sacar(double valor){
        saldo -= valor;
    }
}

//Evite ao máximo colocar o objeto Scanner em classes e métodos, a entrada e saída
//de dados é feita no main
