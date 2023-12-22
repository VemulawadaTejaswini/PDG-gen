import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int first = 1;
        for (int i = 0; i < n; i++) {
            if (d[i] != 0) {
                first = d[i];
                break;
            }
        }

        long ans = 1;
        for (int i = 0; i < n; i++) {
            if (d[i] == 0) {
                continue;
            }

            ans *= d[i];
            ans %= 998244353;
            // System.out.printf("%s -> %s \n", i, ans);
        }

        boolean isAllSame = Arrays.stream(d).allMatch(s -> s == d[0]);
        if (isAllSame) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
    }
}
