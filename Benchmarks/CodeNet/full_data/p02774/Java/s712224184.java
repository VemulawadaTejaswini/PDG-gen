import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	long f(long[] a,long[] b,long zero,long m) {
		//a_i*a_j<=mとなるものの数を数える。
		long ret=0;
		int t=a.length-1;
		for(int i=0;i<a.length;++i) {
			while(t>=0&&a[i]*a[t]>m)--t;
			ret+=Math.max(0, t-i);
		}
		t=0;
		for(int i=b.length-1;i>=0;--i) {
			while(t<b.length&&b[i]*b[t]>m)++t;
			ret+=Math.max(0, i-t);
		}
		t=0;
		for(int i=0;i<a.length;++i) {
			while(t<b.length&&a[i]*b[t]<=m)++t;
			ret+=Math.max(0, t);
		}
		if(m>=0)ret+=zero*(a.length+b.length)+zero*(zero-1)/2;
		return ret;
	}
	
	void run() {
		Scanner sc=new Scanner();
		int N=sc.nextInt();
		long K=sc.nextLong();
		long[] A=new long[N];
		int plus=0,negative=0;
		for(int i=0;i<N;++i) {
			A[i]=sc.nextLong();
			if(A[i]>0)++plus;
			else if(A[i]<0)++negative;
		}
		Arrays.sort(A);
		long[] a=new long[plus];
		long[] b=new long[negative];
		long zero=N-plus-negative;
		int p=0,q=0;
		for(int i=0;i<A.length;++i) {
			if(A[i]>0)a[p++]=A[i];
			else if(A[i]<0)b[q++]=A[i];
		}
		long ok=(long)1e18+1;
		long ng=-(long)1e18-1;
		while(ok-ng>1) {
			long middle=(ok+ng)/2;
			if(f(a,b,zero,middle)>=K) {
				ok=middle;
			}else {
				ng=middle;
			}
		}
		System.out.println(ok);
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}

class Scanner {
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