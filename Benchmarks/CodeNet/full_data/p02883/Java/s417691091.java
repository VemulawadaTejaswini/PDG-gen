import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(f);
        int[][] b = new int[n][2];
        long tmp = 0;
        for (int i = 0; i < n; i++) {
            b[i][0] = a[i];
            b[i][1] = f[n-1 -i];
            long t = b[i][0] * b[i][1];
            if(tmp < t) tmp = t;
        }
        long l = -1L;
        long r = tmp;
        while(l < r-1){
            long m = (l+r)/2;
            long c = 0L;
            for (int i = 0; i < n; i++) {
                long d = b[i][0] - (m / b[i][1]);
                c += 0 < d ? d : 0;
            }
            if(k < c){
                l = m;
            }else{
                r = m;
            }
        }
        System.out.println(r);
        sc.close();

    }

}
