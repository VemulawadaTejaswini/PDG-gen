import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;


public class Main {
	public static void main(String[] args) {
		for(int i=0;i<1;i++) {
			slover();
			out.flush();
		}
	}
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	//StringBuffer S = new StringBuffer(sc.next());
		//String hoge2 = str.reverse().toString();
		//map.containsKey(A)
		//Map<Integer, Integer> map = new HashMap<Integer, Integer>(N);
		/*for ( キーのデータ型 key : マップの名前.keySet() ) {
			データのデータ型 data = マップの名前.get( key );
	 
			// keyやdataを使った処理;
		}*/
		//int i = Integer.parseInt(s);
		//Queue<String> qq=new ArrayDeque<>(); //add,poll,peek BFSは前から実行される
		//Deque<String> dd=new ArrayDeque<>();//push後ろに入れる,poll(pop)後ろからとる,peek addは先頭に入るからバグ注意
		//stackdfsは後ろから実行される
		//ArrayList<Integer> cc = new ArrayList<>(N);
		//cc.contains(tmp)
		//Arrays.asList(c).contains("a")
		//list.set(1,"walk");//1 1 2 3 5
	 
	 
		private static int INF =1000000007;
	 
		
		public static long gcd(long num1,long num2) {
	        if(num2==0) return num1;
	        else return gcd(num2,num1%num2);
	    }
		public static long lcm(long num1,long num2) {
			return num1*num2/gcd(num1,num2);
		}
		private static class D{
			int a,b;
			D(int a,int b){
				this.a=a;;
				this.b=b;
				
			}
			
		}
	
	
	
	
	private static int mod=1000000007;
	private static int slover() {
		
		
		long N=sc.nextLong();
		long K=sc.nextLong();
		
		long t=N%K;
		p(Math.min(t, Math.abs(t-K)));
		
		
		return 1;
	}

/**/

private static long[][] com;
private static void nCr() {
	int MAX = 3001;
	com= new long[MAX][MAX];
	for(int i = 0; i < MAX; i++)
	    com[i][0] = 1;
	for(int i = 1; i < MAX; i++) {
	    for(int j = 1; j <= i; j++) {
	        com[i][j] = com[i-1][j-1] + com[i-1][j];
	        com[i][j] %= mod;
	    }
	}
}

	
	static void p(String ans) {out.println(ans);};
	static void p(int ans) {out.println(ans);};
	static void p() {out.println();};
	static void p(long ans) {out.println(ans);};
	static void p(double ans) {out.println(ans);};

	static void pn(String ans) {out.print(ans);};
	static void pn(int ans) {out.print(ans);};
	static void pn() {out.print("");};
	static void pn(long ans) {out.print(ans);};
	static void pn(double ans) {out.print(ans);};

	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;

	    private boolean hasNextByte() {
	      if (ptr < buflen) {
	        return true;
	      } else {
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

	    private int readByte() {
	      if (hasNextByte()) return buffer[ptr++];
	      else return -1;
	    }

	    private static boolean isPrintableChar(int c) {
	      return 33 <= c && c <= 126;
	    }

	    private void skipUnprintable() {
	      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
	    }

	    public boolean hasNext() {
	      skipUnprintable();
	      return hasNextByte();
	    }

	    public String next() {
	      if (!hasNext()) throw new NoSuchElementException();
	      StringBuilder sb = new StringBuilder();
	      int b = readByte();
	      while (isPrintableChar(b)) {
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
	      while (true) {
	        if ('0' <= b && b <= '9') {
	          n *= 10;
	          n += b - '0';
	        } else if (b == -1 || !isPrintableChar(b)) {
	          return minus ? -n : n;
	        } else {
	          throw new NumberFormatException();
	        }
	        b = readByte();
	      }
	    }

	    public int nextInt() {
	      return (int) nextLong();
	    }

	    public double nextDouble(){
	    	return Double.parseDouble(next());
	    }

	    public int[] nextIntArray(int N, boolean oneBased) {
	      if (oneBased) {
	        int[] array = new int[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      } else {
	        int[] array = new int[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      }
	    }

	    public long[] nextLongArray(int N, boolean oneBased) {
	      if (oneBased) {
	        long[] array = new long[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      } else {
	        long[] array = new long[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      }
	    }
	  }
}

