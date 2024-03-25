import java.util.Scanner;

public class ex8 {
    public static boolean ValidarLadosTriangulo(float lado1, float lado2, float lado3) {
        boolean parar = false;
        if (lado1 > (lado2 + lado3) || lado2 > (lado1 + lado3) || lado3 > (lado1 + lado2))
            parar = true;
        if (lado1 < 0 || lado2 < 0 || lado3 < 0)
            parar = true;

        return parar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float lado1 = 0;
        float lado2 = 0;
        float lado3 = 0;

        System.out.println("Insira os tres lados do triangulo: ");
        lado1 = input.nextFloat();
        lado2 = input.nextFloat();
        lado3 = input.nextFloat();

        if (ValidarLadosTriangulo(lado1, lado2, lado3)) {
            System.out.println("Os valores informados para os lados do triangulo sao invalidos.");
            return;
        }

        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
            System.out.println("Triangulo Escaleno.");
        if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado3)
                || (lado2 == lado3 && lado2 != lado1))
            System.out.println("Triangulo Isosceles.");
        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3)
            System.out.println("Triangulo Equilatero.");

        input.close();

    }

}