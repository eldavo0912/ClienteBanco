public class Banco {
    
    int agencia, conta;
    String nome; 
    private double saldo = 1234.56 ;
    
    public void definirAgencia(int agencia){
        this.agencia = agencia;
    }
    public void definirNome(String nome){
        this.nome = nome;
    }
    public void definirConta(int conta){
        this.conta = conta;
    }
    public void definirSaldo(){
        this.saldo=saldo;
    }


    public double pegarSaldo(){
        return saldo;
    }
    public int pegarAgencia(){
        return agencia;
    }
    public String pegarNome(){
        return nome;
    }
    public int pegarConta(){
        return conta;
    }
}
