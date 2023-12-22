import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sn = new int[n];
        for (int i = 0; i < n; i++) {
            sn[i] = sc.nextInt();
        }

        int sum = solve(n, sn);
        System.out.println(sum);
    }

    public static int solve(int n, int[] sn) {

        // 貪欲したいので昇順ソート
        Arrays.sort(sn);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sn[i];
        }

        int div = 0;
        for (int i = 0; i < n; i++) {
            if (sum % 10 != 0) {
                break;
            }

            if (sn[i] % 10 != 0) {
                sum -= sn[i];
            } else {
                div++;
            }
        }

        if (div == sn.length) {
            sum = 0; // 全ての要素が10の倍数
        }
        return sum;
    }
}

