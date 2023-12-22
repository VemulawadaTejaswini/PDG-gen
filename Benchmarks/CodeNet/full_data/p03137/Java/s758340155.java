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
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] X = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = scan.nextInt();
        }
        Arrays.sort(X);
        if (M <= N) {
            System.out.println(0);
            return;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < M - 1; i++) {
            list.add(X[i+1]-X[i]);
        }
        list.sort(Comparator.reverseOrder());
        long answer = X[M-1] - X[0];
        long sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += list.get(i);
        }
        System.out.println(answer - sum);
    }
}
