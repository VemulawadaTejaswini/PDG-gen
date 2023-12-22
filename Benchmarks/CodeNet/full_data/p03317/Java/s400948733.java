import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N;
    static int K;
    static List<Integer> A = new ArrayList<>();
    static int i1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int Ai = sc.nextInt();
            A.add(Ai);
            if (Ai == 1) {
                i1 = i;
            }
        }

        solve();
    }

    static void solve() {
        int count = 0;

        int start = i1;
        while (start < A.size() - 1) {
            start += K - 1;
            count++;
        }

        start = i1;
        while (start > 0) {
            start -= K - 1;
            count++;
        }

        System.out.println(count);
    }

}
