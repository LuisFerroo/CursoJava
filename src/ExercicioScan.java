import java.util.Locale;
import java.util.Scanner;

public class ExercicioScan {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        char j;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        j = sc.next().charAt(0);
        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(j);
        sc.close();
    }
    
}
