import java.util.Scanner;

class B {
    public static long MOD = 998244353;

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] D = new int[N];
        for (int i = 0; i < N; i++)
            D[i] = sc.nextInt();
        final int[] cnt = new int[N];
        for (int i : D)
            cnt[i]++;
        if (D[0] != 0 || cnt[0] != 1) {
            System.out.println(0);
        } else {
            long ans = 1;
            int used = 1;
            for(int i = 1; i < N && used < N; used += cnt[i++]) {
                for(int j = 0; j < cnt[i]; j++)
                    ans = ans * cnt[i - 1] % MOD;
            }
            System.out.println(ans);
        }
    }
}
public class Main {
    public static void main(String...args) {
        B.main();
    }
}
