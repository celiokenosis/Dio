package DESAFIOS_DE_CODIGO_DIO;

import java.util.Scanner;

public class contaTerminal {

	public static void main(String[] args) {
        // Criando um Scanner para leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e armazenando o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir o \n deixado pelo nextInt()

        // Solicitando e armazenando o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitando e armazenando o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitando e armazenando o saldo
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Montando a mensagem de saída utilizando concatenação
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");

        // Exibindo a mensagem final
        System.out.println(mensagem);

        // Fechando o Scanner
        scanner.close();
    }
}
