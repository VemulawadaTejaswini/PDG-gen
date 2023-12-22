import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int H = ni();
        int W = ni();
        int N = ni();
        int sr = ni();
        int sc = ni();
        String S = ns();
        String T = ns();


        // 右で落とせるか
        int r = sc;
        for(int n = 0; n < N; n++){
            if(S.charAt(n) == 'R'){
                r++;
            }

            if(r > W){
                out.println("NO");
                return;
            }

            if(T.charAt(n) == 'L' && r > 1){
                r--;
            }
        }

        // 左で落とせるか
        r = sc;
        for(int n = 0; n < N; n++){
            if(S.charAt(n) == 'L'){
                r--;
            }

            if(r < 1){
                out.println("NO");
                return;
            }

            if(T.charAt(n) == 'R' && r < W){
                r++;
            }
        }

        // 下で落とせるか
        int h = sr;
        for(int n = 0; n < N; n++){
            if(S.charAt(n) == 'D'){
                h++;
            }

            if(h > H){
                out.println("NO");
                return;
            }

            if(T.charAt(n) == 'U' && h > 1){
                h--;
            }
        }

        // 上で落とせるか
        h = sr;
        for(int n = 0; n < N; n++){
            if(S.charAt(n) == 'U'){
                h--;
            }

            if(h < 1){
                out.println("NO");
                return;
            }

            if(T.charAt(n) == 'D' && h < H){
                h++;
            }
        }

        out.println("YES");
    }

    static int ni() {
        return sc.nextInt();
    }

    static long nl() {
        return sc.nextLong();
    }

    static String ns() {
        return sc.next();
    }

    static int[] niarr(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static long[] nlarr(int N) {
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }
}