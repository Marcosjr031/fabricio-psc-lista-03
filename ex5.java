import java.util.Scanner;

public class ex5 {
    public static String Condicao(double imc) {

        if (imc < 20)
            return "Abaixo do peso.";
        else if (imc >= 20 && imc < 25)
            return "Peso normal.";
        else if (imc >= 25 && imc < 30)
            return "Sobrepeso";
        else if (imc >= 30 && imc < 40)
            return "Obeso";
        else if (imc >= 40)
            return "Obeso Morbido";
        else
            return null;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double peso = 0;
        double altura = 0;
        double imc = 0;

        System.out.println("Insira o seu peso em kg: ");
        peso = input.nextDouble();

        System.out.println("Insira sua altura em metros: ");
        altura = input.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Condicao\tSituacao");
        System.out.printf("%.2f \t\t%s", imc, Condicao(imc));

        input.close();
    }

}