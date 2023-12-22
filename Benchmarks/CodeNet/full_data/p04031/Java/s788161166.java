import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class Main {
	static class IO 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public IO() 
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
        long [] readarray(int sz){
            long [] ret = new long[sz];
            for(int i = 0; i<sz; i++)ret[i] = nextLong();
            return ret;
        }
    } 
    public static void main(String[] args){
        IO fs = new IO();
        int n = fs.nextInt();
        long [] a = fs.readarray(n);
        long ans = Long.MAX_VALUE;
        for(long i = -1000000; i<=1000000; i++){
            long curr = 0;
            for(int j = 0; j<n; j++){
                curr += ((a[j]-i)*(a[j]-i));
            }
            ans = Math.min(ans,curr);
        }
        System.out.println(ans);
    }
}
