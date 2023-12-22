import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        if (N == 1) {
            System.out.println("Yes");
            System.out.println(2);
            System.out.println("1 1");
            System.out.println("1 1");
            return;
        }
        int pair = -1;
        for (int i = 2; i <= N; i++) {
            if ( i * (i - 1) / 2 == N) {
                pair = i;
                break;
            }
        }
        if (pair == -1) {
            System.out.println("No");
            return;
        }
        List<Integer>[] ans = new List[pair];
        for (int i = 0; i < pair; i++) {
            ans[i] = new ArrayList<>();
        }
        int current = 1;
        for (int i = 0; i < pair; i++) {
            for (int j = i + 1; j < pair; j++) {
                ans[i].add(current);
                ans[j].add(current);
                current += 1;
            }
        }
        System.out.println("Yes");
        System.out.println(pair);
        for (int i = 0; i < pair; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(ans[i].size());
            sb.append(" ");
            for (int j = 0; j < ans[i].size(); j++) {
                sb.append(ans[i].get(j));
                sb.append(" ");
            }
            System.out.println(sb.substring(0, sb.length()-1));
        }
    }
}
