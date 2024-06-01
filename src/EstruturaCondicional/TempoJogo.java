package EstruturaCondicional;

import java.util.Scanner;

public class TempoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora do inicio do jogo:");
        int inicio = sc.nextInt();
        System.out.println("Digite a hora do fim do jogo:");
        int fim = sc.nextInt();
        int tempoJogo;
        sc.close();
        if (fim > inicio) {
            tempoJogo = fim - inicio;
            System.out.println("O JOGO DUROU " + tempoJogo + " HORA(S)");
        }
        else {
            tempoJogo = (fim + 24) - inicio;
            System.out.println("O JOGO DUROU " + tempoJogo + " HORA(S)");
        }
    }
}
