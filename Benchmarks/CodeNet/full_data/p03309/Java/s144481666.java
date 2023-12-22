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
        int val = 0;
        if (pp == 0) {
        	val = 0;
        	int xx = 0;
            for (int i=0; i<n; i++) {
                xx += Math.abs(p[i] - (val+i+1));
            }
            System.out.println(xx);
        }
        //System.out.println(0);
        else if (sum > 0) {
            val = (int)Math.ceil(sum / (1.0*n));
            int val1 = (int)Math.floor(sum / (1.0*n));
            if (sum % n == 0) val = 0;
            //System.out.println(sum);
            //System.out.println(val);
            //val = 0;
            //val  =-3;
            int xx = 0;
            if (pp < 0) val = -val;
            //val = -3;
            //val = 1;
            for (int i=0; i<n; i++) {
                xx += Math.abs(p[i] - (val+i+1));
            }
            int xx1 = 0;
            for (int i=0; i<n; i++) {
                xx1 += Math.abs(p[i] - (val1+i+1));
            }
            System.out.println(Math.min(xx,xx1));
        } else {
            val = (int)Math.ceil(sum / (1.0*n));
            val = -val;
            int xx = 0;
            for (int i=0; i<n; i++) {
                xx += Math.abs(p[i] - (val+i+1));
            }
            System.out.println(xx);
        }
    }
}