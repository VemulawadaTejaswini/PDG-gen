import java.util.Scanner;

/**
 * Slimes
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            char[] S = sc.next().toCharArray();

            int ans = 0;
            char c = ' ';
            for (int i = 0; i < N; i++) {
                if (c != S[i]) {
                    c = S[i];
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }

}
