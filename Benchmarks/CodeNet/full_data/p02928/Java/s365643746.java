import java.util.*;

public class Main {
    static long mod = 1000000000+7;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i=0;i<n;i++){
            long sum2 = 0;
            long sum3 = 0;
            for(int j=0;j<n;j++){
                if(a[i]>a[j])sum3++;
                if(j>=i+1){
                    if(a[i]>a[j]){
                        sum2++;
                    }
                }
            }
            long tmp = (sum3*(k*(k-1))/2)%mod;
            sum = (sum + sum2*k + tmp)%mod;
        }
        System.out.println(sum);
    }
}