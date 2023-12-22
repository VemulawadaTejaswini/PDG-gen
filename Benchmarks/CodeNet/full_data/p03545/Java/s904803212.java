import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		String s[]=scanner.next().split("");
		String tmp[]=new String[7];
		tmp[0]=s[0];
		dfs(Integer.parseInt(s[0]),1,1,s,tmp);
		System.out.println(ans);
	}

	static String ans="";
	private static void dfs(int a, int i,int j, String[] s,String[] tmp) {
		if(i==4) {
			if(a==7) {
				ans=String.join("", tmp)+"=7";
			}
			return;
		}
		String tmp1[]=deepCopy(tmp);
		tmp1[j]="+";
		tmp1[j+1]=s[i];
		dfs(a+Integer.parseInt(s[i]),i+1,j+2,s,tmp1);
		String tmp2[]=deepCopy(tmp);
		tmp2[j]="-";
		tmp2[j+1]=s[i];
		dfs(a-Integer.parseInt(s[i]),i+1,j+2,s,tmp2);
	}
	
	private static String[] deepCopy(String[] array) {
		String[] newArray = new String[array.length];
		System.arraycopy(array, 0, newArray, 0, array.length);
		return newArray;
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
