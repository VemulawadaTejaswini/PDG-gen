import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt()-1;
        }
        Map<String, Integer> pairs = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int x = i;
            int y = a[i];
            int min = Math.min(x, y);
            int max = Math.max(x, y);
            int count = pairs.getOrDefault(min + ":" + max, 0);
            pairs.put(min + ":" + max, count+1);
        }
        int answer = 0;
        for (int x : pairs.values()) {
            if (x == 2) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
