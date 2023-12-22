import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Stdin stdin = new Stdin();
        int n = stdin.nextInt();
        if (n <= 2) { // 1 or 2
            System.out.println(n);
            System.exit(0);
        }

        if (n % 2 == 0) {
            System.out.println(n / 2 - 1);
            System.out.println(n / 2 + 1);
        } else {
            System.out.println(n / 2);
            System.out.println(n / 2 + 1);
        }
    }

    private static final class Stdin {
        private BufferedReader stdin;
        private ArrayDeque<String> tokens;

        public Stdin() {
            this.stdin = new BufferedReader(new InputStreamReader(System.in));
            this.tokens = new ArrayDeque<>();
        }

        public String nextToken() throws IOException {
            if (tokens.isEmpty()) {
                for (String token : stdin.readLine().split(" ")) {
                    tokens.add(token);
                }
            }
            return tokens.poll();
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(nextToken());
        }

        public int nextLong() throws NumberFormatException, IOException {
            return Integer.parseInt(nextToken());
        }
    }
}
