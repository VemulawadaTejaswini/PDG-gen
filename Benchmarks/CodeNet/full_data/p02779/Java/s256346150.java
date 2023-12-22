import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for (int i = 0; i < N; i++) {
            int A = scan.nextInt();
            if (set.contains(A)) {
                found = true;
                continue;
            }
            set.add(A);
        }
        String ans = found ? "NO" : "YES";
        System.out.println(ans);
    }
}
