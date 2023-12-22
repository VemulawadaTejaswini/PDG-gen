import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
	
	public static void main(String[] args) throws Exception {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(1, in, out);
        out.close();
	}
	
	
	static class Solver {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
        	int N = in.nextInt();
    		int Q = in.nextInt();
    		ArrayList<Integer> comp = new ArrayList<>();
    		Pair[] list = new Pair[N];
    		for(int i = 0; i < N; i++){
    			int s = in.nextInt(), t = in.nextInt()-1;
    			int x = in.nextInt();
    			comp.add(s-x); comp.add(t-x);
    			list[i] = new Pair(s, t, x);
    		}
    		int[] D = new int[Q];
    		for(int i = 0; i < Q; i++){
    			D[i] = in.nextInt();
    			comp.add(D[i]);
    		}
    		
    		comp = compress(comp);
    		HashMap<Integer, Integer> uniqueMap = new HashMap<>();
    		for(int i = 0; i < comp.size(); i++) uniqueMap.put(comp.get(i), i);
    		
    		Arrays.sort(list, (e1, e2)->Integer.compare(e2.X, e1.X));
    		long[] v = new long[comp.size()];
    		Arrays.fill(v, Long.MAX_VALUE / 2);
    		DualSegmentTree_RUQ seg = new DualSegmentTree_RUQ(v);
    		for(Pair p : list){
    			seg.setSegment(uniqueMap.get(p.S - p.X), uniqueMap.get(p.T - p.X)+1, p.X);
    		}
    		
    		for(int i = 0; i < Q; i++){
    			long x = seg.getPoint(uniqueMap.get(D[i]));
    			if(x != Long.MAX_VALUE / 2) System.out.println(x);
    			else System.out.println(-1);
    		}
        }
        
        ArrayList<Integer> compress(ArrayList<Integer> dataList){
    		ArrayList<Integer> sortedUniqueList = new ArrayList<>(dataList.stream().sorted().distinct().collect(Collectors.toList()));
    		return sortedUniqueList;
    		//HashMap<Long, Integer> uniqueMap = new HashMap<>();
    		//for(int i = 0; i < sortedUniqueList.size(); i++) uniqueMap.put(sortedUniqueList.get(i), i);
    	}
        
        class Pair{
    		int S, T;
    		int X;
    		public Pair(int s, int t, int x){
    			S = s; T = t; X = x;
    		}
    	}
        
        class DualSegmentTree_RUQ{
        	int n;
        	long[] node;
        	int[] stamp;
        	int count;
        	
        	/* 元配列vをセグメント木で表現する */
        	public DualSegmentTree_RUQ(long[] v){
        		n = 1;
        		while(n < v.length) n *= 2;
        		node = new long[2*n-1];
        		stamp = new int[2*n-1];
        		count = 0;
        		
        		for(int i = 0; i < v.length; i++)
        			node[i+n-1] = v[i];
        	}
        	
        	/* 単位元で初期化 */
        	public DualSegmentTree_RUQ(int sz){
        		n = 1;
        		while(n < sz) n *= 2;
        		node = new long[2*n-1];
        		Arrays.fill(node, 0);
        		stamp = new int[2*n-1];
        		count = 0;
        	}
        	
        	/* 0-indexed:xの要素を取得する */
        	public long getPoint(int x){
        		x += n - 1;
        		long res = node[x];
        		int maxCnt = stamp[x];
        		while(x > 0){
        			x = (x - 1) / 2;
        			if(maxCnt < stamp[x]){
        				maxCnt = stamp[x];
        				res = node[x];
        			}
        		}
        		return res;
        	}
        	
        	/* 指定した区間[a,b)に含まれるすべての要素に作用素を適用するクエリ */
        	public void setSegment(int a, int b, long val){
        		count++;//区間加算のタイミングをカウント
        		setSegment(a, b, val, 0, 0, n);
        	}
        	
        	private void setSegment(int a, int b, long val, int k, int l, int r){
        		if(r <= a || b <= l) return;
        		if(a <= l && r <= b){
        			node[k] = val;
        			stamp[k] = count; //タイムスタンプを押す
        			return;
        		}
        		setSegment(a, b, val, 2*k+1, l, (l+r)/2);
        		setSegment(a, b, val, 2*k+2, (l+r)/2, r);
        	}
        }
	}
	
	static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];
 
        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }
 
        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }
 
        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }
 
        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }
 
        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }
 
        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }
 
        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }
 
        static class EndOfFileRuntimeException extends RuntimeException {
        }
 
    }
}
/* end Main */

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
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
    public String nextLine() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(b != 10) {
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
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}