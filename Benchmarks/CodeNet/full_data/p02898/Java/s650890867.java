import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int N = in.nextInt();
        int K = in.nextInt();
        int res = 0;
        for (int i = 0; i < N; i++) {
            int hi = in.nextInt();
            if (hi >= K) {
                res++;
            }
        }
        System.out.println(res);
    }
}
