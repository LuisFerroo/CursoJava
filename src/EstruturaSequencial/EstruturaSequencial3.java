import java.util.Scanner;

public class EstruturaSequencial3 {
    public static void main(String[] args) {
        int A, B, C, D, DIFERENCA;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        sc.close();
        DIFERENCA = ((A*B)-(C*D));
        System.out.println("DIFERENCA = " + DIFERENCA);        
    }
}
