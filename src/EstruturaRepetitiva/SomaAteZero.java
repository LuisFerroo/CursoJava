package EstruturaRepetitiva;

import java.util.Scanner;

public class SomaAteZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int soma = 0;
        while (Number != 0) {
            soma += Number; // atribuicao acumulativa
            Number = sc.nextInt();
        }
        System.out.println(soma);
        sc.close();
    }

}
