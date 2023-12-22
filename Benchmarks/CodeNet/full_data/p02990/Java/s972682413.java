import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int all = Integer.parseInt(sc.next());
        int pattrnNum = Integer.parseInt(sc.next());
        for (int x=1; x<=pattrnNum; x++) {
            long res = 0;
            long i = 1;
            for (int y = 1; y<=x-1; y++) {
                i = i*(pattrnNum-y);
                i = i/y;
            }

            long j = 1;
            int red = all - pattrnNum;
            for (int y = 1; y<=x; y++) {
                if (j<=0) {
                    y = x;
                    j = 0;
                    break;
                }
                j = j*(red+1-y+1);
                j = j/y;
            }
            System.out.println(BigInteger.valueOf(i).multiply(BigInteger.valueOf(j)).remainder(BigInteger.valueOf((long)Math.pow(10,9)+7)));
        }
    }
}