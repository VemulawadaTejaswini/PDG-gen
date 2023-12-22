/*
    It is the level of one's commitment that determines the success, far more than the knowledge one possess.
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Item {
    int v;
    int w;
    Item(int a, int b) {
        v = a;
        w = b;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        long[][] dp = new long[n+1][c+1];

        Item[] it = new Item[n];

        for(int i=0 ; i<n ; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            it[i] = new Item(v, w);
        }

        for(int i=1 ; i<=n ; i++) {
            for(int j=1 ; j<=c ; j++) {
                dp[i][j] = dp[i-1][j];
                if(j >= it[i-1].w) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-it[i-1].w] + it[i-1].v);
                }
            }
        }

        pw.println(dp[n][c]);



        
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
