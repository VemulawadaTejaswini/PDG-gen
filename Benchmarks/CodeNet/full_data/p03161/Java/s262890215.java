/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author 91968
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        
        st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(in.readLine());
        
        int h[] = new int[n];
        
        for(int i = 0; i < n; i++){
        
            h[i] = Integer.parseInt(st.nextToken());
        }
        
        int dp[] = new int[n];
        for(int i = 1; i < n; i++)
            dp[i] = Integer.MAX_VALUE;
                    
        for(int i = 0; i < n; i++){
        
            for(int j = 1; j <= k; j++){
            
                if(i+j < n)
                    dp[i+j] = Math.min(dp[i+j], dp[i]+Math.abs(h[i+j] - h[i]));
            }
        }
        System.out.println(dp[n-1]);
    }
    
}
