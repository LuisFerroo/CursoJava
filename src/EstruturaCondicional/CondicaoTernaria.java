package EstruturaCondicional;

import java.util.Scanner;

public class CondicaoTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        String resultado = (x % 2 == 0) ? "par" : "impar";
        System.out.println(resultado);

    }
}
