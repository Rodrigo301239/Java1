import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero;
        int sequencia;
        float soma = 0;

        System.out.println("Quantos numeros deseja digitar");
        numero = scanner.nextInt();



        for (int i = 0; i < numero; i++){
            System.out.println("Digite o numero: ");
            sequencia = scanner.nextInt();
            soma += sequencia;
        }
        System.out.println("a media dos numeros é "+soma/numero);
        }
    }
