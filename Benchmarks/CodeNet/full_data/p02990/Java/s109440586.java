import java.util.*;
 
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
            }
            for (int y = 1; y<=x-1; y++) {
                i = i/y;
            }

            long j = 1;
            int red = all - pattrnNum;
            for (int y = 1; y<=x; y++) {
                if (j==0) {
                    y = x;
                }
                j = j*(red+1-y+1);
            }
            for (int y = 1; y<=x; y++) {
                if (j==0) {
                    y = x;
                }
                j = j/y;
            }
            res = i*j;
            res = res%((long)Math.pow(10,9)+7);
            System.out.println(res);
        }
    }
}