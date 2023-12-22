import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        long[][] XY = new long[N][2];
        boolean odd = false;
        boolean even = false;
        int tmp;
        for (int i = 0; i < N; i++) {
            XY[i][0] = nextInt(r);
            XY[i][1] = nextInt(r);
        }
        int ans = -1;
        System.out.println(ans);
    }

    public static int nextInt(InputStreamReader r) throws Exception {
        String str = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            str += (char)c;
        }
        return Integer.parseInt(str);
    }
}
