import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	boolean check(char[] s,char[] t,int p) {
		for(int i=p;i<s.length&&i-p<t.length;++i) {
			if(s[i]!=t[i-p]&&s[i]!='?'&&t[i-p]!='?')return false;
		}
		return true;
	}
	
	int f(char[] a,char[] b,char[] c) {
		boolean[] ab=new boolean[a.length+1];
		boolean[] bc=new boolean[b.length+1];
		boolean[] ac=new boolean[a.length+1];
		for(int i=0;i<ab.length;++i) {
			ab[i]=check(a,b,i);
		}
		for(int i=0;i<bc.length;++i) {
			bc[i]=check(b,c,i);
		}
		for(int i=0;i<ac.length;++i) {
			ac[i]=check(a,c,i);
		}
		int ret=a.length+b.length+c.length;
		for(int p=Math.max(0,a.length-b.length);p<=a.length;++p) {
			for(int q=Math.max(0,b.length-c.length);q<=b.length;++q) {
				if(p!=a.length&&!ab[p])continue;
				if(q!=b.length&&!bc[q])continue;
				if(p+q<ac.length&&!ac[p+q])continue;
				ret=Math.min(ret, Math.max(Math.max(p+q+c.length,a.length),p+b.length));
			}
		}
		return ret;
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		char[] a=sc.next().toCharArray();
		char[] b=sc.next().toCharArray();
		char[] c=sc.next().toCharArray();
		int ans=Integer.MAX_VALUE/3;
		ans=Math.min(ans, f(a,b,c));
		ans=Math.min(ans, f(a,c,b));
		ans=Math.min(ans, f(b,a,c));
		ans=Math.min(ans, f(b,c,a));
		ans=Math.min(ans, f(c,a,b));
		ans=Math.min(ans, f(c,b,a));
		PrintWriter pw=new PrintWriter(System.out);
		pw.println(ans);
		pw.close();
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
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