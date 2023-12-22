import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();
        long[] a  = new long[n];
        long[] f  = new long[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        for(int i = 0; i < n; i++){
            f[i] = sc.nextLong();
        }

        Arrays.sort(a);
        Arrays.sort(f);

        long ng = -1;
        long ok = (long) Math.pow(10, 12);

        while(ok - ng > 1){
            long mid = (ok + ng) / 2;
            long sum = 0;
            for(int i = 0; i < n; i++){
                sum += a[i] - mid / f[i];
            }
            if(sum <= k){
                ok = mid;
            }else{
                ng = mid;
            }
        }

        System.out.println(ok);

    }

}
