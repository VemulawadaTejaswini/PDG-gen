
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arrx = new long[N];
        long[] arry = new long[N];
        long[] arrh = new long[N];
        int si = -1;
        for(int i = 0; i < N; i++) {
            arrx[i] = sc.nextLong();
            arry[i] = sc.nextLong();
            arrh[i] = sc.nextLong();
            if(arrh[i] > 0) si = i;
        }

        long resx = -1, resy = -1, resh = -1;
        for(long x = 0; x <= 100; x++) {
            for(long y = 0; y <= 100; y++) {
                long H = arrh[si] + Math.abs(x-arrx[si]) + Math.abs(y-arry[si]);
                boolean ok = true;
                for(int i = 0; i < N; i++) {
                    if(arrh[i] > 0 && H != arrh[i] + Math.abs(x-arrx[i]) + Math.abs(y-arry[i]))
                        ok = false;
                    if (arrh[i] == 0 && H > Math.abs(x - arrx[i]) + Math.abs(y - arry[i]))
                        ok = false;
                }
                if(ok) {
                    resx = x;
                    resy = y;
                    resh = H;
                }
            }
        }
        System.out.println(resx + " " + resy + " " + resh);
    }
}
