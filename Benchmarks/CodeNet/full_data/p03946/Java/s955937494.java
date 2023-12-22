import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main {
	int N,T,size;
    int[] A,segment;

    public void init(int _size){
        size = 1;

        while(size < _size)size *= 2;
        segment = new int[2 * size];
        for(int i = 0;i < 2 * size - 1;i++){
            segment[i] = Integer.MIN_VALUE;
        }
    }

    public void update(int i,int a){
        i += size - 1;
        segment[i] = a;

        while(i > 0){
            i = (i - 1) / 2;
            segment[i] = Math.max(segment[i * 2 + 1], segment[i * 2 + 2]);
        }
    }

    public int query(int a,int b,int k,int l,int r){
        if(r <= a || b <= l)return Integer.MIN_VALUE;

        if(a <= l && r <= b)return segment[k];
        else{
            int vl = query(a,b,k * 2 + 1,l,(l + r) /2);
            int vr = query(a,b,k * 2 + 2,(l + r) / 2,r);

            return Math.max(vl, vr);
        }
    }

    public void solve() {
        N = nextInt();
        T = nextInt();

        init(N);
        A = new int[N];
        for(int i = 0;i < N;i++){
            A[i] = nextInt();
            update(i,A[i]);
        }

        TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();

        for(int i = 0;i < N;i++){
        	int max = query(i,size,0,0,size);
        	int diff = max - A[i];
        	treeMap.put(diff, treeMap.containsKey(diff) ? treeMap.get(diff) + 1 : 1);
        }

        int key = treeMap.lastKey();
        out.println(treeMap.get(key));
    }

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}