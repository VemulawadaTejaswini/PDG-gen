import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        char[] ans = new char[s.length];
        if (isCorrect('S', 'S', ans, s)) {
            System.out.println(String.valueOf(ans));
            return;
        }
        if (isCorrect('S', 'W', ans, s)) {
            System.out.println(String.valueOf(ans));
            return;
        }
        if (isCorrect('W', 'S', ans, s)) {
            System.out.println(String.valueOf(ans));
            return;
        }
        if (isCorrect('W', 'W', ans, s)) {
            System.out.println(String.valueOf(ans));
            return;
        }
        System.out.println(-1);
    }

    private static boolean isCorrect(char c1, char c2, char[] ans, char[] s) {
        ans[0] = c1;
        ans[1] = c2;
        boolean isOK = false;
        for (int i = 1; i < s.length; i++) {
            int idx = i + 1;
            if (i == s.length - 1) {
                idx = 0;
            }
            if (ans[i] == 'S') {
                if (s[i] == 'o' && ans[i - 1] == 'S') {
                    ans[idx] = 'S';
                } else if (s[i] == 'o' && ans[i - 1] == 'W') {
                    ans[idx] = 'W';
                } else if (s[i] == 'x' && ans[i - 1] == 'S') {
                    ans[idx] = 'W';
                } else if (s[i] == 'x' && ans[i - 1] == 'W') {
                    ans[idx] = 'S';
                }
            } else if (ans[i] == 'W') {
                if (s[i] == 'o' && ans[i - 1] == 'S') {
                    ans[idx] = 'W';
                } else if (s[i] == 'o' && ans[i - 1] == 'W') {
                    ans[idx] = 'S';
                } else if (s[i] == 'x' && ans[i - 1] == 'S') {
                    ans[idx] = 'S';
                } else if (s[i] == 'x' && ans[i - 1] == 'W') {
                    ans[idx] = 'W';
                }
            }
            if (idx == 0) {
                if (ans[0] == 'S') {
                    if (s[0] == 'o' && ans[i] == ans[1]) {
                        isOK = true;
                    } else {
                        isOK = (s[0] == 'x' && ans[i] != ans[1]);
                    }
                } else if (ans[i] == 'W') {
                    if (s[0] == 'o' && ans[i] != ans[1]) {
                        isOK = true;
                    } else {
                        isOK = (s[0] == 'x' && ans[i] == ans[1]);
                    }
                }
            }
        }
        return isOK;
    }
}