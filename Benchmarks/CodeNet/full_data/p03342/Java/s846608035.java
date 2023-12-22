import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N =scan.nextInt();
        long[] a = new long[N];
        for(int i=0;i<N;++i)a[i]=scan.nextLong();
        long[] xor = new long[N+1];
        long[] sum = new long[N+1];
        for(int i=0;i<N;++i){
            xor[i+1] = xor[i]^a[i];
            sum[i+1] = sum[i]+a[i];
        }
        long ans = 0;
        for(int i=1;i<=N;++i){
            int left=i,right=N+1;
            while(right-left>1){
                int center=(left+right)/2;
                if((xor[center]^xor[i-1]) == (sum[center]-sum[i-1]))left=center;
                else right=center;
            }
            ans += (long)(right-i);
        }
        System.out.println(ans);
    }
}