import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] x = new long[N];
        for(int i=0;i<N;i++) x[i] = sc.nextLong();
        long[] dis = new long[N];
        for(int i=0;i<N;i++) dis[i]=Math.abs(x[i]);
        if(x[0]>=0){
            System.out.println(x[K-1]);
        }else if(x[N-1]<=0){
            System.out.println(Math.abs(x[N-K]));
        }
        else{
            long ans1 = Long.MAX_VALUE;
            for(int i=0;i<N-K;i++){
                long cur = dis[i]+x[i+K-1]-x[i];
                ans1 = Math.min(ans1,cur);
            }
            long ans2 = Long.MAX_VALUE;
            for(int i=N-1;i>=K-1;i--){
                long cur = dis[i]+x[i]-x[i-K+1];
                ans2 = Math.min(ans2,cur);
            }
            System.out.println(Math.min(ans1,ans2));
        }
    }
}
