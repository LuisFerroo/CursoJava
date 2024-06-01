package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Lisarb {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double renda = sc.nextDouble();
        double imposto;
        sc.close();
        if (renda <= 2000.00) {
            imposto = 0.00;
        }
        else if (renda <= 3000.00) {
            imposto = (renda-2000.00)*0.08;
        }
        else if (renda <= 4500.00) {
            imposto = (1000.00*0.08)+((renda-3000)*0.18);
        }
        else {
            imposto = (1000.00*0.08)+(1500*0.18)+((renda-4500)*0.28);
        }
        if (imposto == 0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
