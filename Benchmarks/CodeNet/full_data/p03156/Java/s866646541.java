import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int[] groups = new int[3];
        for (int i = 0; i < N; i++) {
            int p = scan.nextInt();
            if (p <= A) {
                groups[0] += 1;
            } else if (B < p) {
                groups[2] += 1;
            } else {
                groups[1] += 1;
            }
        }
        System.out.println(Arrays.stream(groups).min().getAsInt());
    }
}
