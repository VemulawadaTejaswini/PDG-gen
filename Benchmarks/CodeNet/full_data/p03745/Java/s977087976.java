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
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        int prev_type = 0;
        int answer = 1;
        int prev = A[0];
        for (int i = 0; i < N; i++) {
            int current_type = type(prev, A[i]);
            prev = A[i];
            if (prev_type == current_type) {
                continue;
            }
            if (prev_type == 0) {
                prev_type = current_type;
                continue;
            }
            if (current_type == 0) {
                continue;
            }
            prev_type = 0;
            answer += 1;
        }
        System.out.println(answer);
    }
    private int type(int prev, int current) {
        if (prev < current) {
            return 1;
        }
        if (current < prev) {
            return -1;
        }
        return 0;
    }
}
