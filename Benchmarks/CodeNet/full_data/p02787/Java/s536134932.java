/*
    Those who cannot remember the past are condemned to repeat it.
                                            - Dynamic Programming
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        Spell[] s = new Spell[n];
        for(int i=0 ; i<n ; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            s[i] = new Spell(u, v);
        }

        int[] dp = new int[h+1];
        for(int i=1 ; i<=h ; i++) dp[i] = (int)1e9+5;


        for(int i=1 ; i<=h ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(i-s[j].x >= 0) {
                    dp[i] = Math.min(dp[i], dp[i-s[j].x] + s[j].y);
                }
                else {
                    dp[i] = Math.min(dp[i], s[j].y);
                }
            }
        }

        pw.println(dp[h]);


        
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}

class Spell {
    int x;
    int y;
    Spell(int u, int v) {
        x = u;
        y = v;
    }
}
