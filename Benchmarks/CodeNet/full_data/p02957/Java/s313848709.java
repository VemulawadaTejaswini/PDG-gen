import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = 0;

        if (A == 0 || B == 0) {
            System.out.println("IMPOSSIBLE");
        }

        while (Math.abs(A - K) != Math.abs(B - K)) {
            K += 1;
        }
        System.out.println(K);
    }
}