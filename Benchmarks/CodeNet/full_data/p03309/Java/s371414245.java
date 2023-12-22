import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        int[] p = new int[n];
        long pp = 0;
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            p[i] = x;
            arr[i] = x - (i+1);
            pp += arr[(int)i];
            sum += Math.abs(arr[(int)i]);
        }
        long val = 0;
        if (pp == 0 || sum == 0) {
        	val = 0;
        	long xx = 0;
            for (int i=0; i<n; i++) {
                xx += Math.abs(p[i] - (val+i+1));
            }
            System.out.println(xx);
        }
        //System.out.println(0);
        else if (sum > 0) {
            val = (long)Math.ceil(sum / (1.0*n));
            long val1 = (long)Math.floor(sum / (1.0*n));
            // if (sum % n == 0) val = 0;
            //System.out.println(sum);
            //System.out.println(val);
            //val = 0;
            //val  =-3;
            long xx = 0;
            if (pp < 0) val = -val;
            //val = -3;
            //val = 1;
            for (int i=0; i<n; i++) {
                xx += Math.abs(p[i] - (val+i+1));
            }
            long xx1 = 0;
            for (int i=0; i<n; i++) {
                xx1 += Math.abs(p[i] - (val1+i+1));
            }
            long xx2 = 0;
            for (int i=0; i<n; i++) {
                xx2 += Math.abs(p[i] - ((val-1)+i+1));
            }
            long xx3 = 0;
            for (int i=0; i<n; i++) {
                xx3 += Math.abs(p[i] - ((val+1)+i+1));
            }
            System.out.println(Math.min(xx,Math.min(xx1,Math.min(xx2,xx3))));
        } else {
            val = (int)Math.ceil(sum / (1.0*n));
            val = -val;
            long xx = 0;
            for (int i=0; i<n; i++) {
                xx += Math.abs(p[i] - (val+i+1));
            }
            System.out.println(xx);
        }
    }
}