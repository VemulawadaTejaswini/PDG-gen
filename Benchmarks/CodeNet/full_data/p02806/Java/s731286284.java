import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        HashMap<String, Integer> map = new HashMap<>();
        String[] list = new String[N];
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            int t = scan.nextInt();
            list[i] = s;
            map.put(s, t);
        }
        String X = scan.next();
        int turn = 0;
        for (int i = 0; i < N; i++) {
            if (list[i].equals(X)) {
                turn = i;
                break;
            }
        }
        long answer = 0;
        for (int i = turn+1; i < N; i++) {
            answer += map.get(list[i]);
        }
        System.out.println(answer);
    }
}
