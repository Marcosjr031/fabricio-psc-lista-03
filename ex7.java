import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeProduto = null;
        int quantidadeProduto = 0;
        float precoUnitarioProduto = 0;

        float total = 0;
        double desconto = 0;
        double totalAPagar = 0;

        System.out.println("Insira o nome do produto: ");
        nomeProduto = input.nextLine();
        System.out.println("Insira a quantidade adquirida: ");
        quantidadeProduto = input.nextInt();
        System.out.println("Insira o preco unitario do produto: ");
        precoUnitarioProduto = input.nextFloat();

        total = quantidadeProduto * precoUnitarioProduto;

        if (quantidadeProduto <= 5)
            desconto = total * 0.02;
        else if (quantidadeProduto > 5 && quantidadeProduto <= 10)
            desconto = total * 0.03;
        else if (quantidadeProduto > 10 && quantidadeProduto < 30)
            desconto = total * 0.05;
        else if (quantidadeProduto >= 30)
            desconto = total * 0.1;

        totalAPagar = total - desconto;

        System.out.println("\nProduto\t\tQuantidade\tPreco Unitario\t\tTotal\t\tDesconto\tTotal a Pagar");
        System.out.printf("%s\t\t%d\t\tR$%.2f\t\t\tR$ %.2f\t\tR$ %.2f\t\tR$ %.2f", nomeProduto, quantidadeProduto,
                precoUnitarioProduto, total, desconto, totalAPagar);

        input.close();

    }

}