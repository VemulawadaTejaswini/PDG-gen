import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long N = scan.nextLong();
        long M = scan.nextLong();
        for (long i = 0; i < M; i++) {
            N -= scan.nextLong();
        }
        if (N < 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(N);
    }
}
