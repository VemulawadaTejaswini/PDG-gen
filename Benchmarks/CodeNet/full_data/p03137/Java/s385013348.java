import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m =sc.nextInt();
		List<Distance> list = new ArrayList<>();
		int[] dist = new int[m];
		long sum = 0;
		for(int i = 0; i < m; i++) {
			dist[i] = sc.nextInt();
		}
		if (n >=m) {
			out.println(0);
		} else {
		Arrays.sort(dist);
		for(int i = 0; i < m - 1; i++) {
			int d = Math.abs(dist[i] - dist[i + 1]);
			Distance distance = new Distance(d, i + 1);
			list.add(distance);
			//out.println(d);
			sum += d;
		}
		Collections.sort(list);
		boolean[] delete = new boolean[m + 10];
		int cnt = 0;
		while (cnt < n - 1 && list.size() > 0) {
			Distance distance = list.get(list.size() - 1);
			int num = distance.num;
			if (delete[num + 1] == false && delete[num - 1] == false) {
				sum -= distance.dist;
				cnt++;
				delete[num] = true;
			}
				list.remove(list.size() - 1);
		}
		
		out.println(sum);
		}
		
       out.close();
    }
static class Distance implements Comparable<Distance>{
	Integer dist;
	Integer num;
	
	Distance(int dist, int num){
		this.dist = dist;
		this.num = num;
	}

	@Override
	public int compareTo(Distance o) {
		
		return this.dist.compareTo(o.dist) ;
	}
}

static class FastScanner {
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
}
