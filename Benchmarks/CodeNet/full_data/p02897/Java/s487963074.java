import java.io.*;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	
	
	
	
	public static int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
	
	
	
	
	static class pair {
        Integer x,y;
        pair (int x,int y){
            this.x=x;
            this.y=y;
        }
    }
	
	
	
	static class length implements Comparator<String>
	{
		public int compare(String a,String b)
		{
			return(a.length()-b.length());
		}
	}
	
	
	
	
	   static class FastReader
	   {
		   BufferedReader br;
		   StringTokenizer st;
		   public FastReader()
		   {
			   br = new BufferedReader(new InputStreamReader(System.in));
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

		public static void main(String []args) throws Exception
		{
			//Scanner sc=new Scanner(System.in);
			FastReader in =new FastReader();
			//Scanner in=new Scanner(System.in);
			PrintWriter pw = new PrintWriter(System.out);
			int n1=in.nextInt();
			double n=n1;
			pw.println(new DecimalFormat("0.0000000000").format((Math.ceil(n/2))/n));
			
			
			
			
			pw.flush();
			pw.close();
			
	}
		
		
}		
		
		
		
		
		
		
		
	