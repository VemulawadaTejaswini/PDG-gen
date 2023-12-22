import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i=0; i<n; i++){
            long tmp = sc.nextLong();
            a[i] = tmp;
        }

        long sum = 0;

        for (int i=0; i<n; i++){
            sum += a[i];
        }


        long[] tmp = new long[n-1];
        tmp[0] = a[0];

        for (int i=1; i<n-1; i++){
            tmp[i] = tmp[i-1]+a[i];
        }

        long[] tmp2 = new long[n-1];

        for (int i=0; i<n-1; i++){
            tmp2[i] = sum-tmp[i];
        }

        long ans = Long.MAX_VALUE;

        for (int i=0; i<n-1; i++){
            ans = Math.min(ans, Math.abs(tmp2[i]-tmp[i]));
        }

        System.out.println(ans);
//        System.out.println(tmp[1]);
    }
}