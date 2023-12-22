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
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int a = scan.nextInt();
            if (!map.containsKey(a)) {
                map.put(a, 0);
            }
            int c = map.get(a);
            map.put(a, c+1);
        }
        long answer = 0;
        for(int x : map.keySet()) {
            int c = map.get(x);
            if (x == c) {
                continue;
            }
            if (x < c) {
                answer += c - x;
                continue;
            }
            answer += c;
        }
        System.out.println(answer);
    }
}
