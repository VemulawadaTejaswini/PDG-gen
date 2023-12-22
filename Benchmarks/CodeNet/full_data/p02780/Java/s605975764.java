import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        double p[];
        double sum[];
        p=new double[N];
        sum=new double[N+1];
        for(int i=0;i<N;i++) p[i]=sc.nextDouble();
        for(int i=0;i<N;i++) p[i]=(p[i]+1)/2;
        for(int i=0;i<N;i++) sum[i+1]=sum[i]+p[i];
        double ans=sum[K];
        for(int i=K+1;i<=N;i++) ans=Math.max(ans,sum[i]-sum[i-K]);
        System.out.printf("%.10f\n",ans);
    }
}