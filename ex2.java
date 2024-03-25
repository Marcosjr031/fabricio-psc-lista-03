import java.util.Scanner;

public class ex2 {

    public static int somaDeTresNumeros(int n1, int n2, int n3) {
        int resultado = 0;

        resultado = n1 + n2 + n3;

        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int media = 0;

        System.out.println("Insira 3 notas para o calculo da media: ");
        nota1 = input.nextInt();
        nota2 = input.nextInt();
        nota3 = input.nextInt();

        media = somaDeTresNumeros(nota1, nota2, nota3) / 3;
        System.out.printf("A media das notas é: " + media);

        if (media >= 7)
            System.out.println("\nAprovado!");
        else
            System.out.println("\nReprovado!");

        input.close();
    }

}