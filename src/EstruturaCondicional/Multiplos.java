package EstruturaCondicional;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (a % b == 0 || b % a == 0){
            System.out.println("SAO MULTIPLOS");
            }
            else {System.out.println("NAO SAO MULTIPLOS");
            }
    }
}
