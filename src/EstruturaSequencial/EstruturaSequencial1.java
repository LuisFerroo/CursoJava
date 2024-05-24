import java.util.Scanner;

public class EstruturaSequencial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, soma;
        A = sc.nextInt();
        B = sc.nextInt();
        soma = A+B;
        sc.close();
        System.out.println("A soma de " + A + " e " + B + " é igual a: " + soma);
    }
}
