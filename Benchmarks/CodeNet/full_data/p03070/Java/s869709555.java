import java.util.Scanner;

public class Main {

    public static int R = 0;
    public static int G = 0;
    public static int B = 0;
    static long[] S;
    static String[] allocS;
    static long ans = 0;
    static int colorMax = 3;

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        S = new long[N];
        allocS = new String[N];

        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }

        Set(0);

        ans = ans % 998244353;

        System.out.println(ans);
    }

    public static void Set(int index) {

        // 割当後
        if (index == S.length) {

            R = 0;
            G = 0;
            B = 0;

            for (int k = 0; k < S.length; k++) {
                if (allocS[k] == "R") R += S[k];
                if (allocS[k] == "G") G += S[k];
                if (allocS[k] == "B") B += S[k];
            }
            if (R != 0 && G != 0 && B != 0) {
                if (R + G > B && R + B > G && G + B > R) {
                    ans++;
                }
            }


            // 割当
        } else {
            for (int l = 0; l < colorMax; l++) {
                if (l == 0) {
                    allocS[index] = "R";
                } else if (l == 1) {
                    allocS[index] = "G";
                } else if (l == 2) {
                    allocS[index] = "B";
                }

                Set(index + 1);
            }
        }
    }
}
