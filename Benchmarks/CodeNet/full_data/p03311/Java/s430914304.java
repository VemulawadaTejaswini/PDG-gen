import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        int [] x = new int[n];
        long min  = (long)1e18;
        for(int i = 1;i<=n;++i)
            min += Math.abs(x[i-1] = sc.nextInt() - i);
        min  = (long)1e18;
        int lo = (int)-1e9;
        int hi = (int)1e9;
        while(lo<=hi){
            int mid = (lo + hi) / 2;
            long sum = 0;
            long sum2 = 0;
            for(int i = 0;i<n;++i) {
                sum += Math.abs(x[i] - mid);
                sum2 += Math.abs(x[i] - mid +1);
            }
            if(sum<sum2){
                min = Math.min(sum2,sum);
                lo = mid + 1;
            }
            else{
                min = Math.min(sum,sum2);
                hi = mid - 1;
            }
            if(min == 15)
                System.out.println(mid);

        }
        System.out.println(min);

    }
}