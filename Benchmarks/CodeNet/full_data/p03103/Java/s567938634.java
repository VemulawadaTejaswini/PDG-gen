import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		
		int c[][]=new int[n][2];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i][0]=a[i];
			c[i][1]=b[i];
		}
		Arrays.sort(c, (p, q) -> Integer.compare(p[0], q[0]));
		long ans=0L;
		long x=0;
		
		for (int i = 0; i < n; i++) {
			if(x+c[i][1]<=m) {
				x+=c[i][1];
				ans+=(long)c[i][1]*c[i][0];
			}else {
				ans+=(long)c[i][0]*(m-x);
				break;
			}
			
			
		}
		
		
		System.out.println(ans);
		
		out.close();
	}
	
	
	
	
	
	
//----------------------------------------------------------
	static int l_min(int[] a) {
		Arrays.sort(a);
		return a[0];
	}
	static int l_max(int[] a) {
		int l=a.length;
		Arrays.sort(a);
		return a[l-1];
	}
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	
}


class UnionFind{
	int parent[];
	int rank[];
	int size[];
	UnionFind(int n) {
		parent=new int[n];
		rank=new int[n];
		size=new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
			rank[i]=0;
			size[i]=1;
		}
	}
	
	void union(int x,int y) {
		int xRoot=find(x);
		int yRoot=find(y);


		if(xRoot!=yRoot) {
			
			if(rank[xRoot]>rank[yRoot]) {
				parent[yRoot]=xRoot;
				size[xRoot]+=size[yRoot];
				
			}else if(rank[xRoot]<rank[yRoot]){
				parent[xRoot]=yRoot;
				size[yRoot]+=size[xRoot];
				
			}else {
				parent[yRoot]=xRoot;
				rank[xRoot]++;
				size[xRoot]+=size[yRoot];
			}
		}
		
	}
	
	int find(int x) {
		if(parent[x]==x) {
			return x;
		}else {
			return find(parent[x]);
		}
		
	}
	
	boolean same(int x,int y) {
		return find(x)==find(y);
	}
	
	
	
}





class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}