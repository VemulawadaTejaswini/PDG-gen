import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int A, B, C, D;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        System.out.println(Math.min(A, B) + Math.min(C, D));
    }
}
