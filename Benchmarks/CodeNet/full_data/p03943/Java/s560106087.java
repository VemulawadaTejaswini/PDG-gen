import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static class Fast
    {
        BufferedReader br;
        StringTokenizer st;
 
        public Fast()
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
    public static void main(String args[] ) throws Exception {
        Fast in=new Fast();
        PrintWriter out = new PrintWriter(System.out); 
	    int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
	    int arr[]={a,b,c};
	    Arrays.sort(arr);
	    if(arr[0]!=arr[1]+arr[2]){
	        out.println("No");
	    }else{
	        out.println("Yes");
	    }
	    
	
	
	
        out.close();
    }
}

