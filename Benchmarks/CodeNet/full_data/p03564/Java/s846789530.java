import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
 
    public static void main(String[] args)
    {
        FastReader in=new FastReader();
        int n = in.nextInt();
        int k = in.nextInt();
        int te=(int)(Math.log(k)/Math.log(2));
        long ans=1,te1=1,te2=1;
        if(te<n)
        {
        	for(int i=0; i<te; i++)
        	{
        		te1*=2;
        	}
        	te2=te1*2;
        	for(int i=0; i<n-te; i++)
        	{
        		te1+=k;
        		te2+=k;
        	}
        	te2-=k;
        	ans=Math.min(te1, te2);
        	System.out.println(ans);
        }
        else
        	System.out.println((long)Math.pow(2, n));
    }
}