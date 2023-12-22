
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int X = scan.nextInt()-1;
        int Y = scan.nextInt()-1;
        HashSet<Integer> counted = new HashSet<Integer>();
        HashSet<Integer> previous = new HashSet<Integer>();
        List<Integer>[] one = new List[N];
        for (int i = 0; i < N; i++) {
            one[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            one[i].add(i+1);
            counted.add(key(i, i+1));
            previous.add(key(i, i+1));
        }
        one[X].add(Y);
        counted.add(key(X, Y));
        previous.add(key(X, Y));
        System.out.println(N);
        for (int i = 2; i < N; i++) {
            if (previous.isEmpty()) {
                System.out.println(0);
                continue;
            }
            HashSet<Integer> next_previous = new HashSet<Integer>();
            long ans = 0;
            for(int x : previous) {
                int from = x / 10000;
                int to = x % 10000;
                for (int next : one[to]) {
                    if (counted.contains(key(from, next))) {
                        continue;
                    }
                    counted.add(key(from, next));
                    next_previous.add(key(from, next));
                    ans += 1;
                }
                for (int next : one[from]) {
                    if (counted.contains(key(to, next))) {
                        continue;
                    }
                    counted.add(key(to, next));
                    next_previous.add(key(to, next));
                    ans += 1;
                }
            }
            System.out.println(ans);
            previous = next_previous;

        }
    }
    private int key(int x, int y) {
        return x * 10000 + y;
    }
}
