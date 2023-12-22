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
        String s = scan.next();
        char[] problem_data = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        String correct = "AKIHABARA";
        char[] correct_data = correct.toCharArray();
        int current = 0;
        int t = 0;
        while (t < correct_data.length) {
            if (current < problem_data.length && correct_data[t] == problem_data[current]) {
                sb.append(problem_data[current]);
                current += 1;
                t += 1;
                continue;
            }
            sb.append("A");
            t += 1;
        }
        if (sb.toString().equals(correct)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
