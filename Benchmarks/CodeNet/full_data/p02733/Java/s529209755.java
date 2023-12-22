import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		long t = System.currentTimeMillis();
		new Main().run();
		System.err.println(System.currentTimeMillis() - t);
	}
	
	boolean check(char[][] m,int[] cnt,int s,int w,int h,int K) {
		int p=0;
		int[] cnt_=Arrays.copyOf(cnt, cnt.length);
		for(int i=0;i<h;++i) {
			int j=i-1;
			do {
				++j;
				cnt_[p]+=(int)(m[j][w]-'0');
				if(cnt_[p]>K)return false;
			} while((s>>j)%2!=1&&j+1<m.length);
			i=j;
			++p;
		}
		cnt=Arrays.copyOf(cnt_, cnt_.length);
		return true;
	}
	
	int[] check2(char[][] m,int[] cnt,int s,int w,int h,int K) {
		int p=0;
		int[] cnt_=Arrays.copyOf(cnt, cnt.length);
		for(int i=0;i<h;++i) {
			int j=i-1;
			do {
				++j;
				cnt_[p]+=(int)(m[j][w]-'0');
				if(cnt_[p]>K)throw new AssertionError();
			} while((s>>j)%2!=1&&j+1<m.length);
			i=j;
			++p;
		}
		return cnt_;
	}

	void run() {
		FastScanner sc = new FastScanner();
		int H=sc.nextInt();
		int W=sc.nextInt();
		int K=sc.nextInt();
		char[][] m=new char[H][];
		for(int i=0;i<H;++i) {
			m[i]=sc.next().toCharArray();
		}
		//1がK個以下
		int INF=Integer.MAX_VALUE/3;
		int ans=INF;
		out:for(int s=0;s<1<<(H-1);++s) {
			int cur=Integer.bitCount(s);
			for(int w=0;w<W;++w) {
				int[] cnt=new int[cur+1];
				if(!check(m,cnt,s,w,H,K))continue out;
				cnt=check2(m,cnt,s,w,H,K);
				int nw=w;
				while(nw+1<W&&check(m,cnt,s,nw+1,H,K)) {
					cnt=check2(m,cnt,s,nw+1,H,K);
					nw++;
				}
				w=nw;
				if(w!=W-1)++cur;
			}
			ans=Math.min(ans, cur);
		}
		PrintWriter pw=new PrintWriter(System.out);
		pw.println(ans==INF?-1:ans);
		pw.close();
	}

	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
    	return (int)nextLong();
    }
}