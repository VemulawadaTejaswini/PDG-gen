import java.util.Scanner;

public class Another {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, A, B;
        N = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();
        if ( B - A < 0) { // 2 4 10 与 1 7 10 这种情况不同，在只有1节的情况下长度不能发生变化，但是在1节以上则可以
            System.out.println("0");
            return;
        }
        if (N == 1) {
            if (A == B) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
            return;
        }
        long min = 0, max = 0;
        for (int i = 0; i < N - 1; i++) {
            min += A;
            max += B;
        }
        min += B;
        max += A;
        System.out.println(max - min + 1);
    }
}