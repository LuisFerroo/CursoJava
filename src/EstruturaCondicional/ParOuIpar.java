package EstruturaCondicional;

import java.util.Scanner;

public class ParOuIpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if (a % 2 == 0) {
            System.out.println(a + " É PAR");
        }
        else {System.out.println(a + " É IMPAR");
        }
    }
}
