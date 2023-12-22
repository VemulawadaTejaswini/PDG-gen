import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Collections;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] k = new int[M];
        int[] s = new int[M];

        for (int i = 0; i < M; i++) {
            k[i] = sc.nextInt();
            int sw = 0;
            for (int j = 0; j < k[i]; j++) {
                sw |= (1 << sc.nextInt() - 1);
            }
            s[i] = sw;
        }

        int[] p = new int[M];
        for (int i = 0; i < M; i++) {
            p[i] = sc.nextInt();
        }

        // bit search
        long cnt = 0;
        for (int b = 0; b < (1 << N); b++) {
            if (b == 0) continue;
            boolean ok = true;
            for (int i = 0; i < M; i++) {
                if ((Integer.bitCount(s[i] & b) % 2) == p[i]) {
                } else {
                    ok = false;
                    break;
                }
            }
            if (ok) cnt++;
        }

        System.out.println(cnt);
    }

}