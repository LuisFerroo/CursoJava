import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, aTriangulo, bCirculo, cTrapezio, dQuadrado, eRetangulo;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        sc.close();
        aTriangulo = (A*C/2);
        bCirculo = (3.14159*Math.pow(C,2));
        cTrapezio = ((A + B)/2)*C;
        dQuadrado = Math.pow(B,2);
        eRetangulo = A*B;
        System.out.printf("TRIANGULO: %.3f%n", aTriangulo);
        System.out.printf("CIRCULO: %.3f%n", bCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", cTrapezio);
        System.out.printf("QUADRADO: %.3f%n", dQuadrado);
        System.out.printf("RETANGULO: %.3f%n", eRetangulo);
    }
}