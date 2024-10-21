import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int valor;
        int num1 = 0;

        System.out.println("Digite um valor");
        valor = scanner.nextInt();

        for (int i = 0;i < valor; i++){
            num1 = num1 + (i+1);
            System.out.println(num1);
        }

    }
}