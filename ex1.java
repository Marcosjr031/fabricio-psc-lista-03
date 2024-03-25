import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float dividendo = 0;
        float divisor = 0;

        System.out.println("Insira dois numeros: ");
        dividendo = input.nextFloat();
        divisor = input.nextFloat();

        if (divisor == 0) {
            System.out.println("Número informado inválido (0).");
            return;
        }

        System.out.printf("O resultado da divisao é %.2f", dividendo / divisor);

        input.close();

    }

}