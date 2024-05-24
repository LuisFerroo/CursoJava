import java.util.Scanner;
import java.util.Locale;
public class EstruturaSequencial4 {
    public static void main(String[] args) {
        int NUMBER, HOURS;
        double VALUATION, SALARY;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        NUMBER = sc.nextInt();
        HOURS = sc.nextInt();
        VALUATION = sc.nextDouble();
        sc.close();
        SALARY = HOURS*VALUATION;
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);
    }
}
