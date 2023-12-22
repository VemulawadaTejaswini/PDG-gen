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
        int K = scan.nextInt();
        HashMap<Integer, Box<Integer>> map = new HashMap<>();
        long answer = 0;
        for (int i = 1; i * K <= 2 * N; i++) {
            for (int x = 1; x <= N; x++) {
                int y = i * K - x;
                if (y <= 0 || N < y) {
                    continue;
                }
                if (!map.containsKey(x)) {
                    map.put(x, new Box<>());
                }
                map.get(x).add(y);
            }
        }
        for (int a : map.keySet()) {
            Box<Integer> bl = map.get(a);
            for (int b : bl.list()) {
                Box<Integer> cl = map.get(b);
                for (int c : cl.list()) {
                    Box<Integer> al = map.get(c);
                    if (al.has(a)) {
                        answer += 1;
                    }
                }
            }
        }
        System.out.println(answer);
    }
    class Box<T> {
        private List<T> list;
        private HashSet<T> set;
        Box () {
            this.list = new ArrayList<>();
            this.set = new HashSet<>();
        }
        void add (T x) {
            this.list.add(x);
            this.set.add(x);
        }
        boolean has(T x) {
            return this.set.contains(x);
        }
        List<T> list() {
            return this.list;
        }
    }
}
