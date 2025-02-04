    import java.util.Scanner;

    public class Main {
        public static void main(String... args) {
            try (Scanner sc = new Scanner(System.in)) {
                final int K = sc.nextInt();
                final int S = sc.nextInt();
                int count = 0;
                for (int X = 0; X <= K; X++) {
                    for (int Y = 0; Y <= K; Y++) {
                        if (X + Y > S) break;
                        if (S - X - Y <= K) count++;
                    }
                }
                System.out.println(count);
            }
        }
    }