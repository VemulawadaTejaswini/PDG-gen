import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        double[] p = new double[N];

        for(int i=0; i<N; i++){
            p[i] = sc.nextDouble();
        }

        double[] sum = new double[N - K + 1];
        double max = 0;
        int x = 0;
        for(int i=0; i<=N-K; i++){
            for(int j=0; j<K; j++){
                sum[i] += p[i + j];
            }
            max = Math.max(max, sum[i]);
            if(max==sum[i]){
                x = i;
            }
        }
        double ans = 0;
        for(int i=x; i<x+K; i++){
            double y = 0;
            for(int j=1; j<=p[i]; j++){
                y += j;
            }
            ans += y / p[i];
        }
        System.out.println(ans);
    }
}