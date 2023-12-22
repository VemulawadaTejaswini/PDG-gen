import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        int M = nextInt();

        long LCM = 1;
        int cnt1 = 0;
        for (int i = 0; i < N; i++) {
            int Ai = nextInt();
            LCM = Ai > LCM ? LCM/GCD(Ai, LCM)*Ai : LCM/GCD(LCM, Ai)*Ai;
            if (i == 0) {
                while (Ai%2 == 0) {
                    Ai = Ai/2;
                    cnt1++;
                }
            } else {
                int cnt2 = 0;
                while (Ai%2 == 0) {
                    Ai = Ai/2;
                    cnt2++;
                }
                if (cnt1 != cnt2) {
                    LCM = Long.MAX_VALUE;
                    break;
                }
            }
        }

        long ans = (M/(LCM/2)+1)/2;
        System.out.println(ans);
    }

    public static long GCD(long l, long s) {
        return s == 0 ? l : GCD(s, l%s);
    }

    public static String nextString() throws Exception {
        String res = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            res += (char)c;
        }
        return res;
    }

    public static int nextInt() throws Exception {
        return Integer.parseInt(nextString());
    }

    public static long nextLong() throws Exception {
        return Long.parseLong(nextString());
    }
}
