import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        FastReader read = new FastReader();
        int n = read.nextInt();
        int r = read.nextInt();
        int ans = 0;
        if(n == 1){
            ans+=300000;
        }
        else if(n==2){
            ans+=200000;
        }
        else if(n==3){
            ans+=100000;
        }
        if(r == 1){
            ans+=300000;
        }
        else if(r==2){
            ans+=200000;
        }
        else if(r==3){
            ans+=100000;
        }
        if(n == 1 && r == 1){
            ans +=400000;
        }
        System.out.println(ans);
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
