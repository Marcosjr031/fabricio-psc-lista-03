import java.util.Scanner;

public class ex3 {
    public static float Percentual(int valorParcial, int valorTotal) {
        return ((float) valorParcial / valorTotal) * 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroEleitores = 0;
        int votosValidos = 0;
        int votosBrancos = 0;
        int votosNulos = 0;

        int somaTotal = 0;

        System.out.println("Insira a quantidade de eleitores: ");
        numeroEleitores = input.nextInt();

        System.out.println("Insira a quantidade de votos: ");
        votosValidos = input.nextInt();
        if (votosValidos > numeroEleitores) {
            System.out.println("\nA quantidade de votos nao pode ser maior que a quantidade de eleitores.");
            return;
        }

        System.out.println("Insira a quantidade de votos em branco: ");
        votosBrancos = input.nextInt();
        if (votosBrancos > numeroEleitores) {
            System.out.println("\nA quantidade de votos em branco nao pode ser maior que a quantidade de eleitores.");
            return;
        }

        System.out.println("Insira a quantidade de votos nulos: ");
        votosNulos = input.nextInt();
        if (votosNulos > numeroEleitores) {
            System.out.println("\nA quantidade de votos nao pode ser maior que a quantidade de eleitores.");
            return;
        }

        System.out.printf("\nVotos validos representam %.2f do total de eleitores %d",
                Percentual(votosValidos, numeroEleitores), numeroEleitores);
        System.out.printf("\nVotos brancos representam %.2f do total de eleitores %d",
                Percentual(votosBrancos, numeroEleitores), numeroEleitores);
        System.out.printf("\nVotos nulos representam %.2f do total de eleitores %d",
                Percentual(votosNulos, numeroEleitores), numeroEleitores);

        somaTotal = votosValidos + votosBrancos + votosNulos;

        if (somaTotal < 100) {
            System.out.printf("\nA quantidade de pessoas que nao votaram é: %d", numeroEleitores - somaTotal);
        }

        input.close();
    }

}