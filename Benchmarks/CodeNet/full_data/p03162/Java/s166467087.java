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
        int [] readarray(int sz){
            int [] ret = new int[sz];
            for(int i = 0; i<sz; i++)ret[i] = nextInt();
            return ret;
        }
    }
    public static class power{
        long x;long y;long mod;
        power(long a,long b){
            this.x = a;this.y = b;
        }
        power(long a,long b,long c){
            this.x = a;this.y = b;this.mod = c;
        }
        long power_without_mod(){
            long res = 1;
            while(y>0){
                if(y%2 == 1)res = (res*x);
                y>>=1;
                x = x*x;
            }
            return res;
        }
        long power_with_mod(){
            long res = 1;
            while(y>0){
                if(y%2 == 1)res = (res*x)%mod;
                y>>=1;
                x = (x*x)%mod;
            }
            return res;
        }
    } 
    public static void main(String[] args){
        IO fs = new IO();
        int n = fs.nextInt();
        int [][] a = new int[n][3];
        for(int i = 0; i<n; i++){
            a[i][0] = fs.nextInt();a[i][1] = fs.nextInt();a[i][2] = fs.nextInt();
        }
        int [] dp = new int[3];
        for(int i = 0; i<n; i++){
            int [] dp1 = new int[3];
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                    if(j!=k)dp1[k] = Math.max(dp1[k],dp[j]+a[i][j]);
                }
            }
            dp = dp1;
        }
        System.out.println(Math.max(dp[0],Math.max(dp[1],dp[2])));
    }
}
