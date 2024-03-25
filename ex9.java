import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Insira sua idade: ");
        idade = input.nextInt();

        if (idade < 16)
            System.out.println("Não pode votar.");
        if (idade == 16 || idade == 17)
            System.out.println("Eleitor facultativo.");
        if (idade >= 18 && idade <= 65)
            System.out.println("Eleitor obrigatorio.");
        if (idade > 65)
            System.out.println("Eleitor facultativo.");

        input.close();
    }

}