import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome;
        Banco clienteNovo = new Banco();
        int conta, agencia;

        System.out.println("Bem-vindo ao Banco Inicio!!");

        System.out.println("Insira o nome do usuário: ");
        nome = sc.nextLine();
        clienteNovo.definirNome(nome);

        System.out.println("Insira o número da conta: ");
        conta = sc.nextInt();
        clienteNovo.definirConta(conta);

        System.out.println("Insira o número da agencia: ");
        agencia = sc.nextInt();
        clienteNovo.definirAgencia(agencia);

        

        System.out.println("Olá "+ clienteNovo.pegarNome() + ", obrigado por criar uma conta em nosso banco, sua agência é " + clienteNovo.pegarAgencia() +", conta "+ clienteNovo.pegarConta() + "e seu saldo" + clienteNovo.pegarSaldo() +" já está disponível para saque");

        sc.close();
    }
}
