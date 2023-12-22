import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }

        long ans1 = 0;
        long ans2 = 0;

        long max = -100000000000000L;
        long min = 100000000000000L;
        int posmax = 0;
        int posmin = 0;
        for(int i=0; i<n+1-k; i++){
            long l = 0;
            long s = 0;
            for(int j=i; j<i+k; j++){
                l += a[j];
                if(a[j] < 0)  s += a[j];
            }
            if(s > max){
                max = s;
                posmax = i;
            }
            if( l < min){
                min = l;
                posmin = i;
            }
        }

        ans1 += max;

        for(int i=0; i<n; i++){
            if(a[i] > 0){
                ans1 += a[i];
            }
        }

        for(int i=0; i<n; i++){
            if((i < posmin || i > posmin + k-1) && a[i] > 0){
                ans2 += a[i];
            }
        }

        System.out.println(Long.max(ans1, ans2));
    }
}