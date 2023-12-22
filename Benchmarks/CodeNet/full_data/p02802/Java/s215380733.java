import java.io.*;
import java.util.*;
import java.math.*;
     
public class Main{
	public static void main(String[] args) throws Exception {
	IO io = new IO();
	PrintWriter out = new PrintWriter(System.out);
	Solver sr = new Solver();
	sr.solve(io,out);
	out.flush();
	out.close();
    	}

	static class Solver
	{
      class Pair{
        int x, y;
        Pair(int a, int b)
        {
          x=a;
          y=b;
        }
      }
	    void solve(IO io, PrintWriter out)
	    {
           int i, j;
          int n = io.nextInt();
          int m = io.nextInt();
          
          ArrayList<Pair> ar = new ArrayList<>();
          for(i=0 ; i<=n ; i++)
            	ar.add(new Pair(0,0));
          for(i=0 ; i<m ; i++)
          {
            int tmp=io.nextInt();
            String str = io.next();
            if(ar.get(tmp).x==0)
            {
              if(str.equals("WA"))
                ar.get(tmp).y++;
              else
                ar.get(tmp).x++;
            }
          }
          int pen=0, correct=0;
          for(Pair p : ar)
          {
            if(p.x!=0)
            {
              correct++;
              pen+=p.y;
            }
          }
            out.print(correct+" "+pen);
	    }
    	
	}
	//Special thanks to Petr (on codeforces) who inspired me to implement IO class!
	static class IO
	{
    	BufferedReader reader;
        StringTokenizer tokenizer;
    	public IO() {
                reader = new BufferedReader(new InputStreamReader(System.in));
                tokenizer = null;
            }
     
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public String nextLine() {
            String s="";
            try {
                    s=reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            return s;
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
    
        public long nextLong() {
            return Long.parseLong(next());
        }
    	double nextDouble()
    	{
    		return Double.parseDouble(next());
    	}
	}
}