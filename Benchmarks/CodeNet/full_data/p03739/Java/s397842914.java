import java.util.Scanner;

public class Main {

    static long ANS_POSI;
    static long ANS_NEGA;
    static int N;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());

        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            long elm = Long.parseLong(sc.next());
            a[i] = elm;
        }

        solve(a);

        System.out.println(Math.min(ANS_POSI, ANS_NEGA));
    }


    private static void solve(long[] a) {
        long posi = 0;
        long nega = 0;
        for (int i = 0; i < N; i++) {
            // 前回のループで変更があった場合は、1か-1になっている値に配列値を合算して合計値としている。
            posi += a[i];
            nega += a[i];
            if (i % 2 == 0) {
                if (posi >= 0) {
                    ANS_POSI += posi + 1;
                    posi = -1;
                }
                if (nega <= 0) {
                    ANS_NEGA -= nega - 1;
                    nega = 1;
                }
            } else {
                if (posi <= 0) {
                    ANS_POSI -= posi - 1;
                    posi = 1;
                }
                if (nega >= 0) {
                    ANS_NEGA += nega + 1;
                    nega = -1;
                }
            }
        }
    }
}
