import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            char[] S = sc.next().toCharArray();

            int ans = 0;

            for (int i = 0; i < S.length / 2; i++) {
                if (S[i] != S[S.length - 1 - i]) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }

}
