import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
	
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
			PrintWriter pw = new PrintWriter(System.out);
			//System.out.println
			//int A=in.nextInt();
			int a=in.nextInt();
		//	ArrayList<Integer> a=new ArrayList<Integer>();
			int b=in.nextInt();
			int c=in.nextInt();
			
			int d=a-b;
			
			if(d>c)
			{
				pw.print(0);
			}
			else
			{
				pw.print(c-d);
			}

			
			
            pw.flush();
			pw.close();
			
	}
		
}		
		
		
		
		