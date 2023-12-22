import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

	static int parent[];
    static int rank[];
    static int[] cycle;
    static void init(int n)
    {
        parent= new int[n+1];
        rank= new int[n+1];
        cycle = new int[n+1];
        for(int i=1;i<n+1;i++){
            parent[i]=i;
            cycle[i] = 1;
        }
        
    }
    
    static void union(int x , int y)
    {
        int Px= FindParent(x);
        int Py= FindParent(y);
        
        if(Px!=Py)
        {
        	if(rank[Px]<rank[Py])
        	{
        		int s = Px;
        		Px = Py;
        		Py = s;
        	}
        	rank[Px]++;
        	parent[Py] = Px;
        	cycle[Px]+=cycle[Py];
        }
        else
        {
        	cycle[Px]++;
        }
        
    }
    
    static int FindParent(int i)
    {
        if(parent[i]==i) 
        	return i;
        
        else{
            int result= FindParent(parent[i]);
            parent[i]= result;
            return result;
        }
    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastScanner s = new FastScanner();
		int n = s.nextInt();
		int m = s.nextInt();
		init(n);
		
		for(int i = 0;i<m;i++)
		{
			int x = s.nextInt();
			int y = s.nextInt();
			int z = s.nextInt();
			//if(z%2==0)
				union(x-1,y-1);
		}
      boolean[] roo = new boolean[n];
      int ans = 0;
      for(int i = 0 ; i<n ; i++)
      {
        	if(!roo[FindParent(i)])
            {
              	roo[FindParent(i)] = true;
              	ans++;
            }
      }
      System.out.println(ans);
		
	}
	
	
static   class FastScanner {
		
	    private InputStream mIs;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner() {
			this(System.in);
		}

		public FastScanner(InputStream is) {
			mIs = is;
		}

		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = mIs.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public String nextString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		
		}	

	}

	
	
	

}