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
        String A = scan.next();
        char[] data_A = A.toCharArray();
        String B = scan.next();
        char[] data_B = B.toCharArray();
        String C = scan.next();
        char[] data_C = C.toCharArray();
        int answer = 0;
        for (int i = 0; i < N; i++) {
            HashSet<Character> set = new HashSet<>();
            set.add(data_A[i]);
            set.add(data_B[i]);
            set.add(data_C[i]);
            if (set.size() == 1) {
                continue;
            }
            if (set.size() == 3) {
                answer += 2;
                continue;
            }
            answer += 1;
        }
        System.out.println(answer);
    }
}
