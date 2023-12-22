import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int L = in.nextInt();
            String[] S = new String[N];
            for (int i = 0; i < N; i++) {
                S[i] = in.next();
            }

            Arrays.sort(S);

            StringBuilder res = new StringBuilder();
            for (int i = 0; i < N; i++) {
                res.append(S[i]);
            }

            System.out.println(res.toString());
        }
    }
}
