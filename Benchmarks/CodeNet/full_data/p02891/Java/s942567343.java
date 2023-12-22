import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            char[] S = reader.readLine().toCharArray();
            long K = Long.parseLong(reader.readLine());

            long ans = 0;
            for (int i = 1; i < S.length; i++) {
                if (S[i] == S[i - 1]) {
                    ans++;
                    S[i] = (char) (S[i] - 32);
                    i++;
                }
            }

            ans = ans * K;

            if (S[S.length - 1] == S[0]) {
                ans += K - 1;
            }

            System.out.println(ans);
        }
    }

}
