import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	InputStream is;
	PrintWriter out;
	String INPUT = "";
	
	void solve()
	{
		int N = ni();
        int[] A = na(3);
        int[] B = na(3);
        
        int N2 = exch1(N, A, B);
        int N3 = exch1(N2, B, A);
        out.println("" + N3);
	}
    
    int exch1(int N, int[] A, int[] B) {
        /*
        def exch1(N, A, B):
        # Have N, at A, going to B
        # what is most acorns can get at B?
        ans = N
        for g in xrange(N+1 if B[0]>A[0] else 1):
            if g * A[0] > N: break
            for s in xrange(N+1 if B[1]>A[1] else 1):
                cost = g*A[0] + s*A[1]
                if cost > N: break
                bns = N + g*(B[0] - A[0]) + s*(B[1] - A[1])
                if bns > ans: ans = bns
                b = (N-cost) / A[2]
                bns = N + g*(B[0] - A[0]) + s*(B[1] - A[1]) + b*(B[2] - A[2])
                if bns > ans: ans = bns
        return ans*/
        int ans = N;
        int glen = B[0] > A[0] ? N : 0;
        int slen = B[1] > A[1] ? N : 0;
        for (int g = 0; g <= glen; ++g) {
            if (g * A[0] > N) break;
            for (int s = 0; s <= slen; ++s) {
                int cost = g*A[0] + s*A[1];
                if (cost > N) break;
                int bns = N + g*(B[0] - A[0]) + s*(B[1] - A[1]);
                if (bns > ans) ans=bns;
                int b = (N-cost) / A[2];
                bns = N + g*(B[0] - A[0]) + s*(B[1] - A[1]) + b*(B[2] - A[2]);
                if (bns > ans) ans = bns;
            }
        }
        
        return ans;
    }
	
	void run() throws Exception
	{
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
//		Thread t = new Thread(null, null, "~", Runtime.getRuntime().maxMemory()){
//			@Override
//			public void run() {
//				long s = System.currentTimeMillis();
//				solve();
//				out.flush();
//				if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
//			}
//		};
//		t.start();
//		t.join();
	}
	
	public static void main(String[] args) throws Exception { new Main().run(); }
	
	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;
	
	private int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
	private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
	
	private double nd() { return Double.parseDouble(ns()); }
	private char nc() { return (char)skip(); }
	
	private String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	
	private int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}
	
	private long[] nal(int n)
	{
		long[] a = new long[n];
		for(int i = 0;i < n;i++)a[i] = nl();
		return a;
	}
	
	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}
	
	private int[][] nmi(int n, int m) {
		int[][] map = new int[n][];
		for(int i = 0;i < n;i++)map[i] = na(m);
		return map;
	}
	
	private int ni() { return (int)nl(); }
	
	private long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }
}
