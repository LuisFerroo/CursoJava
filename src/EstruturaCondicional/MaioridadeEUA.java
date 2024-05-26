package EstruturaCondicional;

import java.util.Scanner;

public class MaioridadeEUA {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        idade = sc.nextInt();
        sc.close();
        if (idade<18) {
            System.out.println("Voce é menor de idade");
        }
        else {
            System.out.println("Voce é maior de idade nos EUA");

        }
        if (idade<21) {
            System.out.println("Voce não pode beber nos EUA");
        }
        else {
            System.out.println("Voce pode beber nos EUA");
        }
        }
        }
