import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        char[] S = sc.nextLine().toCharArray();

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            int tmp = 0;

            for (int j = i; j < N; j++) {
                // 右側の人が変わる数
                if (j + 1 >= N) {
                    // 一番右の場合は抜ける
                    break;
                }
                char right = S[j + 1];
                if (right == 'E') {
                    tmp++;
                }
            }
            for (int j = i; j > 0; j--) {
                // 左側の人が変わる数
                char left = S[j - 1];
                if (left == 'W') {
                    tmp++;
                }
            }

            ans[i] = tmp;
        }

        int min = Arrays.stream(ans).min().orElse(0);
        System.out.println(min);
    }
}

