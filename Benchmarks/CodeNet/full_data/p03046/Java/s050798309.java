import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int M = in.nextInt();
            int K = in.nextInt();

            if (K == 0) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0, I = 1 << (M); i < I; i++) {
                    sb.append(" " + i + " " + i);
                }
                System.out.println(sb.toString().trim());
                return;
            }

            int xor = 0;
            for (int i = 0, I = 1 << (M); i < I; i++) {
                if (i == K) {
                    continue;
                }
                xor ^= i;
            }

            if (xor == K) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0, I = 1 << (M); i < I; i++) {
                    if (i == K) {
                        continue;
                    }
                    sb.append(" " + i);
                }
                sb.append(" " + K);
                for (int i = (1 << (M)) - 1; i >= 0; i--) {
                    if (i == K) {
                        continue;
                    }
                    sb.append(" " + i);
                }
                sb.append(" " + K);
                System.out.println(sb.toString().trim());
            } else {
                System.out.println(-1);
            }
        }
    }
}
