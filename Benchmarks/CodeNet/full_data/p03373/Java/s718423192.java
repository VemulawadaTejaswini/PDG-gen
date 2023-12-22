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
   public static void main(String args[])
    {
        Scanner  sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int t=1;//sc.nextInt();
        long ans=0,te=0;
        while(t-->0)
        {
           long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),x=sc.nextLong(),y=sc.nextLong();
            long max=Math.max(x,y),min=Math.min(x,y);
              if(min*(a+b)<=min*2*c)
              {
                ans+=min*(a+b);
              }
              else ans+=2*c*min;
            if(max==x)
            ans+=Math.min((max-min)*a,(max-min)*2*c);
            else ans+=Math.min((max-min)*b,(max-min)*2*c);
            pw.println(ans);
        }
           pw.close();
    }
}
  