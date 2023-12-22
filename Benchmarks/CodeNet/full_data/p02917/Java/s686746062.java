import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] B = new int[N];
        for (int i = 0; i < N-1; i++) {
            B[i] = scan.nextInt();
        }
        int answer = B[0] + B[N-2];
        for (int i = 1; i < N - 1; i++) {
            answer += Math.min(B[i-1],B[i]);
        }
        System.out.println(answer);
    }
}
