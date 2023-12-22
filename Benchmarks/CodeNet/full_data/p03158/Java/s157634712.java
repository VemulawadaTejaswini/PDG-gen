import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] a = new long[n];
        long[] x = new long[q];
        for(int i=0; i<n; i++) a[i] = sc.nextLong();
        for(int i=0; i<q; i++) x[i] = sc.nextLong();
        sc.close();

        Arrays.sort(a);
        long[] taket = new long[n];
        taket[0] = Long.MAX_VALUE;
        int apos = 1;
        for(int i=1; i<n; i++){
            for(int j=apos; j<n; j++){
                if(j - i >= i){
                    taket[i] = (a[n-i-1] + a[n-j-1]) / 2;
                    apos = j;
                    break;
                }
            }
        }

        long[] asumr = new long[n];
        long[] asuml = new long[n];
        asumr[0] = a[n-1];
        asuml[0] = n%2==1 ? a[0] : a[1];
        for(int i=1; i<n/2 + n%2; i++){
            asumr[i] = asumr[i-1] + a[n-1-i];
            asuml[i] = asuml[i-1] + a[i*2 + 1 - n%2];
        }

        long[] taketr = new long[n];
        for(int i=0; i<n; i++){
            taketr[n-i-1] = taket[i];
        }

        for(int i=0; i<q; i++){
            int pos = Arrays.binarySearch(taketr, x[i]);
            if(pos < 0) pos = -pos - 1;
            int tr = Math.min(n/2+n%2, n-1-pos);
            int tl = n/2+n%2 - tr - 2;
            long sr = asumr[tr];
            long sl = tl >= 0 ? asuml[tl] : 0;
            System.out.println(sl + sr);
        }

    }
}