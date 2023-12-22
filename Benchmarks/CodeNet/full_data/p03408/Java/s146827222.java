import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        HashMap<String, Integer> b = new HashMap<>();
        HashMap<String, Integer> r = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            if (!b.containsKey(s)) {
                b.put(s, 0);
            }
            int c = b.get(s);
            b.put(s,c+1);
        }
        int M = scan.nextInt();
        for (int i = 0; i < M; i++) {
            String s = scan.next();
            if (!r.containsKey(s)) {
                r.put(s, 0);
            }
            int c = r.get(s);
            r.put(s,c+1);
        }
        int answer = 0;
        for (String s : b.keySet()) {
            int count1 = b.get(s);
            int count2 = r.containsKey(s) ? r.get(s) : 0;
            answer = Math.max(count1 - count2, answer);
        }
        System.out.println(answer);
    }
}
