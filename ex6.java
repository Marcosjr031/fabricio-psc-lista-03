import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0;

        System.out.println("Insira um código para a estação do ano: ");
        System.out.println("1 - Primavera");
        System.out.println("2 - Verao");
        System.out.println("3 - Outono");
        System.out.println("4 - Inverno\n");
        numero = input.nextInt();

        switch (numero) {
            case 1:
                System.out.println("A primavera é a estação das flores.");
                break;
            case 2:
                System.out.println("O verão é a estação mais quente.");
                break;
            case 3:
                System.out.println("O outono é a estação da renovação.");
                break;
            case 4:
                System.out.println("O inverno é a estação mais fria.");
                break;
        
            default:
                System.out.println("Codigo invalido!");
                break;
        }

        input.close();
    }


}