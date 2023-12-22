import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[A[i]-1] = i+1;
        }
        StringJoiner sj = new StringJoiner(" ");
        for(int x : ans) {
            sj.add(Integer.toString(x));
        }
        System.out.println(sj.toString());
    }
}
