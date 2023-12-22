import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long K = sc.nextLong();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i * M + j * N - i * j == K) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}