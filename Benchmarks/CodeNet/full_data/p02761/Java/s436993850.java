import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            char[] C = new char[N];
            Arrays.fill(C, '#');

            for (int i = 0; i < M; i++) {
                int s = sc.nextInt() - 1;
                char c = (char) (sc.nextInt() + '0');

                if (C[s] != '#' && C[s] != c) {
                    System.out.println(-1);
                    return;
                }

                C[s] = c;
            }

            if (C[0] == '0' && N > 1) {
                System.out.println(-1);
                return;
            }

            for (int i = 0; i < N; i++) {
                if (C[i] == '#') {
                    if (i == 0) {
                        C[i] = '1';
                    } else {
                        C[i] = '0';
                    }
                }
            }

            System.out.println(String.valueOf(C));
        }
    }

}
