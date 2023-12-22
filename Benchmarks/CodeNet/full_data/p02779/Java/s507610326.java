import java.io.BufferedReader; 
import java.io.*;
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.*;
import java.math.*;
public class Main 
{ 
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
  static int gcd(int a,int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }

    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int test = 1;//sc.nextInt();
        while(test-- > 0)
        {
            int n = sc.nextInt();
            Set<Integer> hs=new HashSet<>();
            for(int i=0;i<n;i++) hs.add(sc.nextInt());
            if(hs.size()==n)
            pw.println("YES");
            else pw.println("NO");
        }
        pw.close();
    }
}
  