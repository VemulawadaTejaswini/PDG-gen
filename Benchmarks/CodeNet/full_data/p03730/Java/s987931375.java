import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String[] sl = s.split(" ");
            int A = Integer.parseInt(sl[0]);
            int B = Integer.parseInt(sl[1]);
            int C = Integer.parseInt(sl[2]);

            boolean flg = false;

            // 最小公倍数まで見れば十分
            for (int i = A; i <= A * B; i++) {
                if (i % A == 0 && i % B == C) {
                    flg = true;
                    break;
                }
            }

            System.out.println(flg ? "YES" : "NO");
        }
    }
}
