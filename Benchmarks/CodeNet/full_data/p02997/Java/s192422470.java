import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Stdin stdin = new Stdin();
        int n = stdin.nextInt();
        int k = stdin.nextInt();
        for (int i = 0; i <= (n - 1) / 2; i++) {
            int x = (n - i - 1) * (n - i - 2) / 2 + i;
            if (x == k) {
                List<Integer> l = new ArrayList<>();
                List<Integer> r = new ArrayList<>();
                for (int j = 0; j < n - i - 1; j++) {
                    l.add(1);
                    r.add(j + 2);
                }
                for (int j = 0; j < i; j++) {
                    l.add(r.get(j));
                    r.add(r.get(r.size() - 1) + 1);
                }
                
                System.out.println(l.size());
                for (int j = 0; j < l.size(); j++) {
                    System.out.printf("%d %d%n", l.get(j), r.get(j));
                }
                System.exit(0);
            }
        }
        
        System.out.println(-1);
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
