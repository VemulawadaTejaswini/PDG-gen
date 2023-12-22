import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());

        if (K < N || K < M) {
            System.out.println("No");
            return;
        }

        if (K % N == 0 || K % M == 0) {
            System.out.println("Yes");
            return;
        }


        for (int n = 0; n <= N; n++) {
            for (int m = 0; m <= M; m++) {
                int sum = n * m + (N - n) * (M - m);
                if (sum == K) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");

    }
}
