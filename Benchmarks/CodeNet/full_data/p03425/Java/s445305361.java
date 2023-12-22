import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        String march[] = "MARCH".split("");
        long cnt[] = new long[5];
        Arrays.fill(cnt, 0);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < 5; j++) {
                if (str.startsWith(march[j])) {
                    cnt[j]++;
                }
            }
        }

        long ans = 0L;
        ans += cnt[0] * cnt[1] * cnt[2];
        ans += cnt[0] * cnt[1] * cnt[3];
        ans += cnt[0] * cnt[1] * cnt[4];
        ans += cnt[0] * cnt[2] * cnt[3];
        ans += cnt[0] * cnt[2] * cnt[4];
        ans += cnt[0] * cnt[3] * cnt[4];
        ans += cnt[1] * cnt[2] * cnt[3];
        ans += cnt[1] * cnt[2] * cnt[4];
        ans += cnt[1] * cnt[3] * cnt[4];
        ans += cnt[2] * cnt[3] * cnt[4];

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
