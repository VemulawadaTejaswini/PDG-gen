import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int K = scan.nextInt();
        for (int i = A; i <= Math.min(B,A+K-1); i++) {
            System.out.println(i);
        }
        for (int i = Math.max(B-K+1, A+K); i <= B; i++) {
            System.out.println(i);
        }

    }
}
