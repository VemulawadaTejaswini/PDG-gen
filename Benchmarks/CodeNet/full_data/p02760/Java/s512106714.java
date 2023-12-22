import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int[] card = new int[9];
        for (int i = 0; i < 9; i++) {
            card[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            for (int j = 0; j < 9; j++) {
                if (card[j] == b) {
                    card[j] = -1;
                }
            }
        }

        // 横
        for (int i = 0; i < 9; i+=3) {
            if (card[i] == -1 && card[i+1] == -1 && card[i+2] == -1) {
                System.out.println("Yes");
                return;
            }
        }

        // 縦
        for (int i = 0; i < 3; i++) {
            if (card[i] == -1 && card[i+3] == -1 && card[i+6] == -1) {
                System.out.println("Yes");
                return;
            }
        }

        // 斜め
        if (card[0] == -1 && card[4] == -1 && card[8] == -1 ||
                card[2] == -1 && card[4] == -1 && card[6] == -1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}