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
        int L = scan.nextInt();
        int[] apple = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            apple[i] = L + i + 1 - 1;
            sum += apple[i];
        }
        Arrays.sort(apple);
        int diff = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int taste = sum - apple[i];
            if (Math.abs(sum - taste) < diff) {
                answer = taste;
                diff = Math.abs(sum - taste);
            }
        }
        System.out.println(answer);
    }
}
