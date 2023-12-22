                    ////////////////////////////////////////////////////
                    //                                                //
                    //  For her who keeps the fire kindling in me...  //
                    //                                                //
                    ////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
// import java.util.Scanner;
// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.Collections; 
// import java.util.StringTokenizer;
import java.util.*;
import java.lang.Math;
import java.awt.Point;

import java.awt.geom.*;

public class Main {



	static int min(int a, int b) { return (a < b)? a : b; } 
	

        static int knapSack(int W, int wt[], int val[], int n) 
        { 
            int i, w; 
        int K[][] = new int[n+1][W+1]; 
        
        
        for (i = 0; i < n; i++) 
        { 
            for (w = 0; w <= W; w++) 
            { 
    
                if(i==0 && w==0) 
                    K[i][w] = 0;
                else if (i==0)
                    K[i][w] = (int)Math.ceil(((double)w/wt[i])) * val[i];
                else if(w==0)
                    K[i][w] = 0;
                else if (wt[i] <= w) 
                    K[i][w] = min(((int)Math.ceil(((double)wt[i]/wt[i])) * val[i]) + K[i-1][w-wt[i]], K[i-1][w]); 
                else
                    K[i][w] = K[i-1][w];
                    
                    
                //System.out.print(K[i][w]+" ");
            } 
            //System.out.println("");
        } 
        
        return K[n-1][W]; 
        } 

    public static void main(String args[]) {
        try {
            FastReader s = new FastReader();
            BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
            int i, j;
            int m, n, sum, t, max, k, h, x, y, min, correct_ans, vert, num, size, local_ans, global_ans;
            long a, b;

            h = s.nextInt();
            n = s.nextInt();
            
            int arrw[] = new int[n];
            int arrval[] = new int[n];

            for(i=0; i<n; i++){
                arrw[i] = s.nextInt();
                arrval[i] = s.nextInt();
            }
            knapSack(h, arrw, arrval, n);
            w.write(knapSack(h, arrw, arrval, n)+"\n");
            w.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// ========================================### FAST IO ###=========================================//
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    Double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
// ====================================================================================================//