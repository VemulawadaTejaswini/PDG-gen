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
        int[] L = new int[N * 2];
        for (int i = 0; i < N * 2; i++) {
            L[i] = scan.nextInt();
        }
        Arrays.sort(L);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += L[2 * i];
        }
        System.out.println(sum);
    }
}
