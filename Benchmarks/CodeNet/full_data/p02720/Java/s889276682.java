import java.math.*;
import java.util.*;

public class Main {
    static long jud(long n) {
        int keta[] = { 9, 36, 117, 360, 1089, 3276, 9837, 29520, 88569, 265716 };
        long tmp = 0;
        for (int i = 0; i < 10; i++) {
            if (n >= keta[i]) {
                tmp =(long)Math.pow(10, i+1);
            }
        }
        return tmp;
    }

    static boolean lunlun(long a) {
        long tmp =String.valueOf(a).length();
        long d =(long)Math.pow(10, tmp - 1);
        long tmp2 = a / d;
        for (int i = 0; i < tmp; i++) {
            if (Math.abs((a / d) - tmp2) > 1) {
                return false;
            }
            if (i != tmp - 1)
            tmp2=Math.abs((a / d));
            a %= d;
            d /= 10;
            
            
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long keta[] = { 9, 36, 279, 2466, 22149, 199296, 1793619, 16142526, 30491433, 159631596 };
        long cnt = keta[String.valueOf((int)jud(k)).length() - 2]+1;
        long lun = (int)jud(k);
        long ans = 0;
        if (k < 10) {
            ans = k;
        }
        else {
            while (true) {
                lun++;
                if (lunlun(lun)) {
                    cnt++;
                    if (cnt == k) {
                        ans = lun;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}