import java.util.Scanner;
import java.util.Locale;
public class EstruturaSequencial5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int Codigo1, Quantidade1, Codigo2, Quantidade2;
        double ValorUn1, ValorUn2, Total;
        Scanner sc = new Scanner(System.in);
        Codigo1 = sc.nextInt();
        Quantidade1 = sc.nextInt();
        ValorUn1 = sc.nextDouble();
        Codigo2 = sc.nextInt();
        Quantidade2 = sc.nextInt();
        ValorUn2 = sc.nextDouble();
        sc.close();
        Total = (Quantidade1*ValorUn1)+(Quantidade2*ValorUn2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", Total);
    }
}
