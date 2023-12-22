import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		int n=scanner.nextInt();
		String s[]=String.valueOf(n).split("");
		int nl=s.length;
		String x[]={"3","5","7"};
		dfs("",nl,n,x);
		System.out.println(cnt);
	}

	static int cnt=0;
	private static void dfs(String s, int nl, int n, String[] x) {
		if(!s.equals("")){
		int tmp=Integer.parseInt(s);
		if(check(s)&&tmp<=n){
			cnt++;
		}
		}
		if(s.length()==nl){
			return;
		}
		dfs(s+x[0],nl,n,x);
		dfs(s+x[1],nl,n,x);
		dfs(s+x[2],nl,n,x);
	}
	private static boolean check(String s) {
		int cnt3=0;
		int cnt5=0;
		int cnt7=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='3'){
				cnt3++;
			}
			if(c=='5'){
				cnt5++;
			}
			if(c=='7'){
				cnt7++;
			}
		}
		if(cnt3>0&&cnt5>0&&cnt7>0){
			return true;
		}
		return false;
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
