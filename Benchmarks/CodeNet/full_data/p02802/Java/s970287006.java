import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
  
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
FastReader in= new FastReader();
int N=in.nextInt();
int M=in.nextInt();
int p[]=new int[M];
String S[]=new String[M];
for(int i=0;i<M;i++)
{
p[i]=in.nextInt();
S[i]=in.next();
}
int solve[]=new int[N];
int wa[]=new int[N];
int cor=0,pen=0;
for(int i=0;i<M;i++)
{
if((S[i].equals("WA"))&&(solve[p[i]-1]==0))
wa[p[i]-1]++;

else if((S[i].equals("AC"))&&(solve[p[i]-1]==0))
{
cor++;
solve[p[i]-1]++;
pen+=wa[p[i]-1];
}

}
System.out.println(cor+" "+pen);
}

}


