import java.io.*;
import java.util.*;
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
        String s=in.next();
        String t=in.next();
        int l=s.length(), lt=t.length();
        boolean flag=false, flag2;
        int i;
        SortedSet<String> a=new TreeSet<String>();
        String temp = "";
        for(i=0; i<=l-lt; i++)
        {
        	flag2=true;
        	for(int j=0; j<lt; j++)
        	{
        		if((s.charAt(i+j)!=t.charAt(j))&&s.charAt(i+j)!='?')
        			flag2=false;
        	}
        	if(flag2)
        	{
        		
        		flag=true;
        		if(i!=0)
        			temp=s.substring(0, i)+t+s.substring(i+lt, l);
        		if(i==0)
        			temp=t+s.substring(i+lt, l);
        		
        		//System.out.println(temp);
        		a.add(temp);
        	}
        }
        Iterator<String> it=a.iterator();
        char[] b = null;
        if(it.hasNext())
        {
        	temp=it.next();
        	//System.out.println(temp.length());
        	b= temp.toCharArray();
        for(int j=0; j<l; j++)
        {
        	if(b[j]=='?')
        		b[j]='a';
        }
        }
        if(!flag)
        	System.out.println("UNRESTORABLE");
        else
        	System.out.println(b);
    }
}