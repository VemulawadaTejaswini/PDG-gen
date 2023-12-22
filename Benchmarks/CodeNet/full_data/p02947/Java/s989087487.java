import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] list = new int[n][26];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            char[] s = sc.next().toCharArray();
            for (int j = 0; j < 10; j++) {
                list[i][Math.abs('a' - s[j])]++;
            }

            for (int j = i-1; j >= 0; j--) {
                boolean isSame = true;
                for (int k = 0; k < 10; k++) {
                    if (list[i][k] != list[j][k]) {
                        isSame = false;
                        break;
                    }
                }
                if (isSame)
                    ans++;
            }
        }

        System.out.println(ans);
    }
}