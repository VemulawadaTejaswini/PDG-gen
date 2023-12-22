import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String xx = sc.next();
		String yy = sc.next();
		char[] x = xx.toCharArray();
		char[] y = yy.toCharArray();
		int[][] L = new int[x.length + 1][y.length + 1];

		for (int i = 1; i <= x.length; i++)
			for (int j = 1; j <= y.length; j++)
				if (x[i - 1] == y[j - 1]) {
					L[i][j]=L[i-1][j-1]+1;
				}
				else 
					L[i][j]=Math.max(L[i][j-1], L[i-1][j]);
		
		boolean [] take=new boolean[x.length];
		
		int i=x.length;
		int j=y.length;
		
		while(i>0 && j>0 ) {
			
			while(j>0 && L[i][j]==L[i][j-1])
					j--;
			while(i>0 && L[i][j]==L[i-1][j])
				i--;
			if(i>0) {
				take[i-1]=true;
				j--;
			}
		}
		int ctr=0;
		for(Boolean b:take) {
			if(b)
				System.out.print(x[ctr]);
			ctr++;
		}
	}
	static class Scanner 
	{
	    StringTokenizer st;
	    BufferedReader br;

	    public Scanner(InputStream s){    br = new BufferedReader(new InputStreamReader(s));}

	    public String next() throws IOException 
	    {
	        while (st == null || !st.hasMoreTokens()) 
	            st = new StringTokenizer(br.readLine());
	        return st.nextToken();
	    }

	    public int nextInt() throws IOException {return Integer.parseInt(next());}
	    
	    public long nextLong() throws IOException {return Long.parseLong(next());}

	    public String nextLine() throws IOException {return br.readLine();}
	    
	    public double nextDouble() throws IOException
	    {
	        String x = next();
	        StringBuilder sb = new StringBuilder("0");
	        double res = 0, f = 1;
	        boolean dec = false, neg = false;
	        int start = 0;
	        if(x.charAt(0) == '-')
	        {
	            neg = true;
	            start++;
	        }
	        for(int i = start; i < x.length(); i++)
	            if(x.charAt(i) == '.')
	            {
	                res = Long.parseLong(sb.toString());
	                sb = new StringBuilder("0");
	                dec = true;
	            }
	            else
	            {
	                sb.append(x.charAt(i));
	                if(dec)
	                    f *= 10;
	            }
	        res += Long.parseLong(sb.toString()) / f;
	        return res * (neg?-1:1);
	    }
	    
	    public boolean ready() throws IOException {return br.ready();}


	}

}
