import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        if (N > M) { int c = N;  N = M; M = c; }
        long ans = 1;
        if (N == 1) {
            if (M > 1) ans = M - 2;
        } else ans = (N - 2) * (M - 2);
        System.out.println(ans);
        sc.close();
    }
}
