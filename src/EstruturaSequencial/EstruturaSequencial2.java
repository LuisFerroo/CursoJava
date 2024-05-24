import java.util.Locale;
import java.util.Scanner;
public class EstruturaSequencial2 {
    public static void main(String[] args) {
        double pi, raio, area;
        pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();
        sc.close();
        area = pi*Math.pow(raio, 2);
        Locale.setDefault (Locale.US);
        System.out.printf("A area de um circulo com raio de %.2f é %.4f", raio, area);
    }
}
