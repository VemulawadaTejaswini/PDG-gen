import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] s = new int[M];
            int[] c = new int[M];
            for (int i = 0; i < M; i++) {
                s[i] = sc.nextInt() - 1;
                c[i] = sc.nextInt();
            }

            for (int n = 0; n < 1000; n++) {
                if (isValid(n, N, s, c)) {
                    System.out.println(n);
                    return;
                }
            }

            System.out.println(-1);
        }
    }

    private static boolean isValid(int n, int N, int[] s, int[] c) {
        String S = "" + n;
        if (S.length() != N) {
            return false;
        }
        for (int i = 0; i < c.length; i++) {
            if (S.charAt(s[i]) - '0' != c[i]) {
                return false;
            }
        }
        return true;
    }

}