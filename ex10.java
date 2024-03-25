import java.util.Scanner;

public class ex10 {
    public static void InformacoesDaVenda(float valorCompra) {
        double valorVenda = 0;

        if (valorCompra < 10) {
            valorVenda = valorCompra + (valorCompra * 0.7);
            System.out.println("\nPorcentagem de Lucro\tValor da Venda");
            System.out.print("\t70%");
            System.out.printf("\t\tR$ %.2f", valorVenda);
        } else if (valorCompra >= 10 && valorCompra < 30) {
            valorVenda = valorCompra + (valorCompra * 0.5);
            System.out.println("\nPorcentagem de Lucro\tValor da Venda");
            System.out.print("\t50%");
            System.out.printf("\t\tR$ %.2f", valorVenda);
        } else if (valorCompra >= 30 && valorCompra < 50) {
            valorVenda = valorCompra + (valorCompra * 0.4);
            System.out.println("\nPorcentagem de Lucro\tValor da Venda");
            System.out.print("\t40%");
            System.out.printf("\t\tR$ %.2f", valorVenda);
        } else if (valorCompra >= 50) {
            valorVenda = valorCompra + (valorCompra * 0.3);
            System.out.println("\nPorcentagem de Lucro\tValor da Venda");
            System.out.print("\t30%");
            System.out.printf("\t\tR$ %.2f", valorVenda);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float valorCompra = 0;

        System.out.println("\nLojinha do Sr. Aboo");
        System.out.println("\nInforme o valor da compra (R$):");
        valorCompra = input.nextFloat();

        InformacoesDaVenda(valorCompra);

        input.close();

    }

}