import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		int n=scanner.nextInt();
		long k=scanner.nextLong();
		long[] a=new long[n];
		String[] as=new String[n];
		long max=Integer.MIN_VALUE;
		Arrays.fill(as, "");
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextLong();
			max=Math.max(max, a[i]);
			if(a[i]==0) {
				as[i]="0";
				continue;
			}
			for(long j=a[i];j>0;j/=2) {
				if(j%2==0) {
					as[i]="0"+as[i];
				}else {
					as[i]="1"+as[i];
				}
			}
		}
		int cnt=0;
		for(long i=max;i>0;i/=2) {
			cnt++;
		}
		String ks="";
		for(long i=k;i>0;i/=2) {
			if(i%2==0) {
				ks="0"+ks;
			}else {
				ks="1"+ks;
			}
		}
		for(int i=0;i<cnt-ks.length();i++) {
			ks="0"+ks;
		}
		for(int i=0;i<n;i++) {
			int l=as[i].length();
			for(int j=0;j<ks.length()-l;j++) {
				as[i]="0"+as[i];
			}
		}
		String xs="";
		boolean bool=false;
		for(int i=0;i<ks.length();i++) {
			int b=0;
			int w=0;
			for(int j=0;j<n;j++) {
				long tmp=as[j].charAt(i);
				if(tmp=='0')b++;
				else w++;
			}
			if(b<=w) {
				if(ks.charAt(i)=='1') {
					bool=true;
				}
				xs=xs+"0";
			}else {
				if(ks.charAt(i)=='1') {
					xs=xs+"1";
				}else {
					if(bool) {
						xs=xs+"1";
					}else {
						xs=xs+"0";
					}
				}
			}
		}
		long x=0;
		for(int i=0;i<xs.length();i++) {
			char c=xs.charAt(xs.length()-1-i);
			if(c=='1') {
				x+=Math.pow(2, i);
			}
		}
		long ans=0;
		for(int i=0;i<n;i++) {
			ans+=a[i]^x;
		}
		System.out.println(ans);
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
