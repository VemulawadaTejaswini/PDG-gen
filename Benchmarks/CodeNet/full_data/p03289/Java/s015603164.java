import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            boolean flg = false;
            if (s.charAt(0) == 'A') {
                int cnt = 0;
                int at = 0;
                for (int i = 2; i <= s.length() - 2; i++) {
                    if (s.charAt(i) == 'C') {
                        cnt++;
                        at = i;
                    }
                }
                if (cnt == 1) {
                    flg = true;
                    for (int i = 1; i < s.length(); i++) {
                        if (i == at) continue;
                        if (s.charAt(i) < 'a'  || 'z' < s.charAt(i)) {
                            flg = false;
                            break;
                        }
                    }
                }
            }

            System.out.println(flg ? "AC" : "WA");
        }
    }
}
