import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        //knapsack probk
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int [] val = new int[N+1];
        int [] wt = new int[N+1];
        int W = Integer.parseInt(st.nextToken());
        long [][] K  = new long[N+1][W+1];
        for (int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            wt[i] = Integer.parseInt(st.nextToken());
            val[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0;i<=N;i++){
            for (int w =0;w<=W;w++){
             if (i==0|w==0)
                 K[i][w] = 0;
             else if (wt[i-1]<=w){
                 K[i][w] = Math.max(val[i-1]+K[i-1][w-wt[i-1]],K[i-1][w]);
             }else
                 K[i][w] = K[i-1][w];
            }
        }
        pw.println(K[N][W]);
        pw.flush();
    }
}
