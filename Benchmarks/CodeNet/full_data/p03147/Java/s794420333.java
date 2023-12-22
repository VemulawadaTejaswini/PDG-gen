import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int[] h = new int[n];
        for (int i = 0; i < n; i++) h[i] = sc.nextInt();

        int cnt = 0;
        boolean flag = false;

        while (true) {
            flag = false;
            for (int i = 0; i < n; i++) {
                if (s[i] != h[i]) {
                    s[i] += 1;
                    flag = true;
                } else if (s[i] == h[i] && flag) {
                    cnt += 1;
                    flag = false;

                }
            }
            if (flag) cnt += 1;
            if (Arrays.equals(s, h)) break;
        }
        System.out.println(cnt);
    }
}
