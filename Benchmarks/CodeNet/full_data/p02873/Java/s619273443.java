import java.util.*;

public class Main {

    public static void main(String args[]) {
        int cons[] = new int[500001];
        int ans[] = new int[500001];
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        if (s.charAt(n - 1) == '>') {
            cons[n - 1] = 1;
        } else {
            cons[n - 1] = 0;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '>' && s.charAt(i + 1) == '>') {
                cons[i] = cons[i + 1] + 1;
            } else {
                cons[i] = 1;
            }
        }

        if (s.charAt(0) == '<') {
            ans[0] = 0;
        } else {
            ans[0] = cons[0];
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                if (s.charAt(i) == '<') {
                    ans[i] = ans[i - 1] + 1;
                } else {
                    ans[i] = cons[i];
                }
            } else {
                if (s.charAt(i) == '<') {
                    ans[i] = 0;
                } else {
                    ans[i] = Math.max(ans[i - 1] + 1, cons[i]);
                }
            }
        }

        if (s.charAt(n - 1) == '>') {
            ans[n] = 0;
        } else {
            ans[n] = ans[n - 1] + 1;
        }

        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += ans[i];
        }
    }

}
