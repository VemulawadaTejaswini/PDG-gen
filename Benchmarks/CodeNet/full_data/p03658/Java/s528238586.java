import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// B - Snake Toy
// https://atcoder.jp/contests/abc067/tasks/abc067_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());
        Integer[] l = new Integer[N];
        for (int i = 0; i < N; i++) {
            l[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        Arrays.sort(l, Comparator.reverseOrder());

        int ans = 0;
        for (int i = 0; i < K; i++) {
            ans += l[i];
        }

        System.out.println(ans);
    }
}
