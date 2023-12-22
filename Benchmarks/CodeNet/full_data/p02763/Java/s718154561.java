import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	class SegTree{
		int n=1;
		int[] v;
		
		public SegTree(int n) {
			while(this.n<n)this.n*=2;
			v=new int[2*this.n-1];
		}
		
		void set(int k,int val) {
			k+=n-1;
			v[k]=1<<val;
			while(k>0) {
				k=(k-1)/2;
				v[k]=v[2*k+1]|v[2*k+2];
			}
		}
		
		int query(int a,int b) {
			return query(0,n,a,b,0);
		}
		
		int query(int l,int r,int a,int b,int k) {
			if(r<=a||b<=l)return 0;
			else if(a<=l&&r<=b)return v[k];
			else {
				int vl=query(l,(l+r)/2,a,b,2*k+1);
				int vr=query((l+r)/2,r,a,b,2*k+2);
				return vl|vr;
			}
		}
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int n=sc.nextInt();
		char[] cs=sc.next().toCharArray();
		SegTree seg=new SegTree(n);
		for(int i=0;i<cs.length;++i)seg.set(i, (int)(cs[i]-'a'));
		int q=sc.nextInt();
		PrintWriter pw=new PrintWriter(System.out);
		for(int i=0;i<q;++i) {
			int t=sc.nextInt();
			if(t==1) {
				int iq=sc.nextInt()-1;
				int cq=(int)(sc.next().charAt(0)-'a');
				seg.set(iq, cq);
			}else {
				int lq=sc.nextInt()-1;
				int rq=sc.nextInt()-1;
				pw.println(Integer.bitCount(seg.query(lq, rq+1)));
			}
		}
		pw.close();
	}
	
	static void tr(Object... objects) {
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