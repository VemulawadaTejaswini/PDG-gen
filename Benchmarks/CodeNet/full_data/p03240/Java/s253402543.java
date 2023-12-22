
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int H1 = -1;
                boolean isAns = true;

                for (int i = 0; i < N; i++) {
                    int Htmp = calcH(x[i], y[i], h[i], cx, cy);
                    if(Htmp < 1){ continue; }
                    if(H1 < 1) { H1 = Htmp; }

                    if(Htmp != H1){
                        isAns = false;
                        break;
                    }
                }

                if(isAns){
                    out.println(cx + " " + cy + " " + H1);
                    exit(0);
                }
            }
        }
    }

    private static int calcH(int x, int y, int h, int cx, int cy){
        if(h != 0) {
            return h + Math.abs(x - cx) + Math.abs(y - cy);
        }
        return -1; //h = 0のときは計算できない
    }
}
