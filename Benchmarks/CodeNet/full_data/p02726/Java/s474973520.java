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
            one[i+1].add(i);
            counted.add(key(i, i+1));
            previous.add(key(i, i+1));
        }
        one[X].add(Y);
        one[Y].add(X);
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
                    if (next == from) {
                        continue;
                    }
                    if (counted.contains(key(from, next))) {
                        continue;
                    }
                    counted.add(key(from, next));
                    next_previous.add(key(from, next));
                    //System.out.printf("Add %d %d\n", Math.min(from, next), Math.max(from, next));
                    ans += 1;
                }
                for (int next : one[from]) {
                    if (next == to) {
                        continue;
                    }
                    if (counted.contains(key(to, next))) {
                        continue;
                    }
                    counted.add(key(to, next));
                    next_previous.add(key(to, next));
                    //System.out.printf("Add %d %d\n", Math.min(to, next), Math.max(to, next));
                    ans += 1;
                }
            }
            System.out.println(ans);
            previous = next_previous;

        }
    }
    private int key(int x, int y) {
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        return min * 10000 + max;
    }
}
