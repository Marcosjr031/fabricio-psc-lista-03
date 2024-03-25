import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Caixa Eletronico: ");

        char opcaoMenu = ' ';

        System.out
                .println("\nExibir Saldo(A)\t\tExibir Extrato(B)\tRealizar Deposito(C)\tRealizar Saque(D)\tSair(E)\n");
        opcaoMenu = input.next().charAt(0);

        switch (opcaoMenu) {
            case 'A':
                System.out.println("Voce escolheu o menu \'Exibir Saldo\'");
                break;
            case 'B':
                System.out.println("Voce escolheu o menu \'Exibir Extrato\'");
                break;
            case 'C':
                System.out.println("Voce escolheu o menu \'Realizar Deposito\'");
                break;
            case 'D':
                System.out.println("Voce escolheu o menu \'Realizar Saque\'");
                break;
            case 'E':
                System.out.println("Voce escolheu o menu \'Sair\'");
                break;

            default:
                System.out.println("A opcao escolhida e invalida.");
                break;
        }

        input.close();

    }

}