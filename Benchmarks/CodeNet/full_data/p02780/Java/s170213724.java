import java.io.*;

class Main{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] n = s.split(" ");
        int N = Integer.parseInt(n[0]);
        int K = Integer.parseInt(n[1]);
        String[] pr = br.readLine().split(" ");
        double[] p = new double[N];

        for(int i=0; i<N; i++){
            p[i] = Integer.parseInt(pr[i]);
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