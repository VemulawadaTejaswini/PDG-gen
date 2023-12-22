
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws java.lang.Exception {
		try {
			FastScanner fs = new FastScanner();
			int n = fs.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=fs.nextInt();
			}
			int first = a[0];
			int second=a[1];
			int step=0;
			for(int i=2;i<n;i+=2)
			{
				if(a[i]!=first)
				{
					step++;
				}
			}
			for(int i=1;i<n;i+=2)
			{
				if(a[i]!=second)
					step++;
			}
			
			System.out.println(step);
		}
		catch(Exception e) {
			return ;
		}
	}
	
	static class FastScanner 
    { 
       
		BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() 
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
