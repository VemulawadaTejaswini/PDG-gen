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
        int n = fs.nextInt(),k = fs.nextInt(),x = fs.nextInt(),y = fs.nextInt();
        if(n<=k)System.out.println(n*x);
        else{
            System.out.println(k*x+(n-k)*y);
        }
    }
}
