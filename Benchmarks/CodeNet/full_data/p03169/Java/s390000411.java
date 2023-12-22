//package may2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			FastReader scn = new FastReader();
			OutputStream out = new BufferedOutputStream ( System.out );
			int n =scn.nextInt();
			int[] cnt = new int[4];
			
			for(int i = 0;i<n;i++) {
				int sv=scn.nextInt();
				cnt[sv]++;
			}
			int max =305;
			double[][][] p= new double[max][max][max],ev = new double[max][max][max];
			p[cnt[1]][cnt[2]][cnt[3]]=1;
			for(int c = n;c>=0;c--) {
				for(int b = n;b>=0;b--) {
					for(int a = n;a>=0;a--) {
						if(a==0&&b==0&&c==0) {
							continue;
						}
						if(a+b+c>n)
							continue;
						double p_wasted = ((double)n-(a+b+c))/n;
						
						double ev_wasted = (p_wasted/(1-p_wasted))+1;
						ev[a][b][c] += ev_wasted*p[a][b][c]; 
						if(a!=0) {
							double p_go = (double)a/(a+b+c);
							p[a-1][b][c] += p[a][b][c]*p_go;
							ev[a-1][b][c] += ev[a][b][c]*p_go;
							
						}
						if(b!=0) {
							double p_go = (double)b/(a+b+c);
							p[a+1][b-1][c] += p[a][b][c]*p_go;
							ev[a+1][b-1][c]+=ev[a][b][c]*p_go;
						}
						if(c!=0) {
							double p_go = (double)c/(a+b+c);
							p[a][b+1][c-1] += p[a][b][c]*p_go;
							ev[a][b+1][c-1]+=ev[a][b][c]*p_go;
						}
						
					}
				}
			}
			out.write((ev[0][0][0]+"\n").getBytes());
			out.close();
	}

	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }

}
