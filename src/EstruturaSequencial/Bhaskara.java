package EstruturaSequencial;
import java.util.Scanner;
public class Bhaskara {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite valor de a:");
        a = sc.nextDouble();
        // Verificar se 'a' é zero
        if (a == 0) {
            System.out.println("O valor de 'a' não pode ser zero em uma equação de segundo grau.");
            return;
        }
        System.out.println("Digite valor de b:");
        b = sc.nextDouble();
        System.out.println("Digite valor de c:");
        c = sc.nextDouble();
        sc.close();
        delta = Math.pow(b, 2.0)-(4.0*a*c);
        // Verificar se 'delta' é negativo
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais, pois o delta é negativo.");
            return;
        }
        x1 = (-b+Math.sqrt(delta))/(2.0*a);
        x2 = (-b-Math.sqrt(delta))/(2.0*a);
        System.out.println("Os resultados da equação de segundo grau com 'a' valendo " + a + ", 'b' valendo " + b + " e 'c' valendo " + c + " é " + x1 + " e " + x2 + "!");
    }  
}
