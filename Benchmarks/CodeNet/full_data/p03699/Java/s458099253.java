import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int min = 1000;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            if (s[i] % 10 != 0 && min > s[i]) {
                min = s[i];
            }
            ans += s[i];
        }
        Arrays.sort(s);
        if (min == 1000 && ans % 10 == 0) {
            System.out.println(0);
        } else if (min == 1000) {
            System.out.println(ans);
        } else if (ans % 10 == 0) {
            System.out.println(ans - min);
        } else {
            System.out.println(ans);
        }

    }
}