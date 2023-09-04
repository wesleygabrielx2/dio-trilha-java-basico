package DesafioControleFluxo;
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro (deve ser maior que o primeiro):");
        int num2 = scanner.nextInt();

        scanner.close();

        try {
            contar(num1, num2);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void contar(int entrada1, int entrada2) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (entrada1 >= entrada2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        int contagem = entrada2 - entrada1;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
            //realizar o for para imprimir os números com base na variável contagem
        }
    }
}

