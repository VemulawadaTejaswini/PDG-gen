import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		Queue<Work> que = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			que.offer(new Work(sc.nextInt(), sc.nextInt()));
		}
		
		int[] candidate = new int[m];
		
		while(que.size() > 0) {
			Work work = que.poll();
			int num = m - work.date;
			int index = -1, min = Integer.MAX_VALUE / 10;
			for (int i = 0; i <=num; i++) {
				if (min > candidate[i]) {
					min = candidate[i];
					index = i;
				}
			}
			if ( index != -1 && candidate[index] <= work.point)
				candidate[index] = work.point;
		}
		long sum = 0;
		for(int i = 0; i < candidate.length; i++)
			sum += (long)candidate[i];
		
		out.println(sum);
		
		
		out.close();
	} 
	static class Work implements Comparable<Work>{
		Integer date;
		Integer point;
		Work(int date, int point){
			this.date = date;
			this.point = point;
		}

		@Override
		public int compareTo(Work o) {
			int res =-  date.compareTo(o.date);
			if (res != 0)
				return res;
			else
				return - point.compareTo(o.point);
		}		
	}


public static class Pair implements Comparable<Pair> {
    int from; int to; long cost;
    Pair(int from,int to, long cost) {
    	this.from = from;
        this.to = to;
        this.cost = cost;
    }
    public int compareTo(Pair p) {
        return Long.compare(cost, p.cost);
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
