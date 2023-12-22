import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String S = reader.readLine();

            int MOD = 1000000007;

            long[][] count = new long[10002][13];

            count[0][0] = 1;

            for (int i = 1; i <= S.length(); i++) {
                char c = S.charAt(i - 1);

                if (c != '?') {
                    int j = c - '0';
                    for (int k = 0; k < 13; k++) {
                        count[i][(k * 10 + j) % 13] = count[i - 1][k];
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            count[i][(k * 10 + j) % 13] += count[i - 1][k];
                        }
                    }

                    for (int k = 0; k < 13; k++) {
                        count[i][k] %= MOD;
                    }
                }
            }

            System.out.println(count[S.length()][5]);
        }
    }

}
