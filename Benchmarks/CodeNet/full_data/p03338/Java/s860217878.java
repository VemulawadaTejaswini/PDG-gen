import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        int ans = 0;

        for (int i = 0; i <= n; i++) {
            int cnt = func(s.substring(0, i).toCharArray(), s.substring(i).toCharArray());

            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }

    private static int func(char[] left, char[] right) {
        int cnt = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            boolean flgleft = false;
            boolean flgright = false;
            for (int i = 0; i < left.length; i++) {
                if (left[i] == c) {
                    flgleft = true;
                }
            }
            for (int i = 0; i < right.length; i++) {
                if (right[i] == c) {
                    flgright = true;
                }
            }
            if (flgleft && flgright) {
                cnt++;
            }
        }
        return cnt;
    }
}