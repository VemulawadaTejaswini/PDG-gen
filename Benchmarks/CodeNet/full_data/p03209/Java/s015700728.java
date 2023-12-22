import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long x = sc.nextLong();
    long[] strLen = new long[n+1];
    long cntP = 0;

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        strLen[0] = 1;
        for (int i=1; i<=n; i++) {
            strLen[i] = strLen[i-1] * 2 + 3;
        }
//        System.out.println(Arrays.toString(strLen));

        while (true) {
            if (x == 1) {
                System.out.println(cntP);
                return;
            }
            if (x == strLen[n] / 2) {
                System.out.println(cntP + (strLen[n]/2 - 1) / 2 + 1 );
                return;
            }
            if (x == strLen[n] / 2 + 1) {
                System.out.println(cntP + (strLen[n]/2 - 1) / 2 + 2 );
                return;
            }
            if (x == strLen[n] - 1) {
                System.out.println(cntP + strLen[n]/2 + 1);
                return;
            }
            if (x == strLen[n]) {
                System.out.println(cntP + strLen[n]/2 + 1);
                return;
            }
            if (1 < x && x < strLen[n] / 2) {
                x--;
                n--;
                continue;
            }
            if (strLen[n] / 2 + 1 < x && x < strLen[n] - 1) {
                cntP += strLen[n] / 4L;
                cntP++;
                x--;
                x -= (strLen[n] / 2 - 1);
                x--;
                n--;
                continue;
            }
        }

    }


}
