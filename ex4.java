import java.util.Scanner;

public class ex4 {
    public static void calculoSalario() {
        Scanner entrada = new Scanner(System.in);

        double salario;
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;

        System.out.println();
        System.out.print("Insira o valor do salário atual: ");
        salario = entrada.nextDouble();

        if (salario <= 1000) {
            salario *= taxaAumento3;
        } else if (salario <= 2000) {
            salario *= taxaAumento2;
        } else if (salario <= 3000) {
            salario *= taxaAumento1;
        } else if (salario <= 4000) {
            salario = (salario * taxaAumento1) + 200;
        }

        System.out.println();
        System.out.printf("Novo Salário: R$ %.2f\n\n", salario);

        entrada.close();
    }
}