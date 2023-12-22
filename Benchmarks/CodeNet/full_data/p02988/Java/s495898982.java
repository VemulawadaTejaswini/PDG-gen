import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(OrdinaryNumber(N, P, 1));
    }
    public static int OrdinaryNumber(int N, int[] P, int index) {
        if (N - 1 <= index) {
            return 0;
        }
        if ((P[index - 1] < P[index] && P[index] < P[index + 1]) ||
            (P[index + 1] < P[index] && P[index] < P[index - 1])) {
            return 1 + OrdinaryNumber(N, P, index + 1);
        }
        return OrdinaryNumber(N, P, index + 1);
    }
}
