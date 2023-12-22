import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int q=scanner.nextInt();
		List<Long>s=new ArrayList<>();
		List<Long>t=new ArrayList<>();
		List<Long>x=new ArrayList<>();
		for(int i=0;i<a;i++){
			s.add(scanner.nextLong());
		}
		for(int i=0;i<b;i++){
			t.add(scanner.nextLong());
		}
		for(int i=0;i<q;i++){
			x.add(scanner.nextLong());
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<q;i++){
			long[] dis=new long[8];
			long tarx=x.get(i);
			dis[0]=ll(tarx,s,t);
			dis[1]=rr(tarx,s,t);
			dis[2]=lr(tarx,s,t);
			dis[3]=rl(tarx,s,t);
			dis[4]=ll(tarx,t,s);
			dis[5]=rr(tarx,t,s);
			dis[6]=lr(tarx,t,s);
			dis[7]=rl(tarx,t,s);
			Arrays.sort(dis);
			sb.append(dis[0]+"\n");
		}
		System.out.println(sb);
	}
	private static long ll(long tarx, List<Long> o, List<Long> p) {
		long res=0;
		int oi=lower_bound(o, tarx);
		if(oi==-1){
			return Long.MAX_VALUE;
		}
		long now=o.get(oi);
		res+=Math.abs(tarx-now);
		int pi=lower_bound(p, now);
		if(pi==-1){
			return Long.MAX_VALUE;
		}
		res+=Math.abs(now-p.get(pi));
		return res;
	}
	private static long rr(long tarx, List<Long> o, List<Long> p) {
		long res=0;
		int oi=upper_bound(o, tarx);
		if(oi==o.size()){
			return Long.MAX_VALUE;
		}
		long now=o.get(oi);
		res+=Math.abs(tarx-now);
		int pi=upper_bound(p, now);
		if(pi==p.size()){
			return Long.MAX_VALUE;
		}
		res+=Math.abs(now-p.get(pi));
		return res;
	}
	private static long lr(long tarx, List<Long> o, List<Long> p) {
		long res=0;
		int oi=lower_bound(o, tarx);
		if(oi==-1){
			return Long.MAX_VALUE;
		}
		long now=o.get(oi);
		res+=Math.abs(tarx-now);
		int pi=upper_bound(p, now);
		if(pi==p.size()){
			return Long.MAX_VALUE;
		}
		res+=Math.abs(now-p.get(pi));
		return res;
	}
	private static long rl(long tarx, List<Long> o, List<Long> p) {
		long res=0;
		int oi=upper_bound(o, tarx);
		if(oi==o.size()){
			return Long.MAX_VALUE;
		}
		long now=o.get(oi);
		res+=Math.abs(tarx-now);
		int pi=lower_bound(p, now);
		if(pi==-1){
			return Long.MAX_VALUE;
		}
		res+=Math.abs(now-p.get(pi));
		return res;
	}
	private static int lower_bound(List<Long> list, long val) {
		return ~Collections.binarySearch(list, val, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1) - 1;
	}

	private static int upper_bound(List<Long> list, long val) {
		return ~Collections.binarySearch(list, val, (x, y) -> x.compareTo(y) > 0 ? 1 : -1);
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
