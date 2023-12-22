import java.io.*;
import java.util.*;

public class Main {
	
	static long[] sumLengthOfDigitNumber = new long[19];
	static long[] digit10 = new long[19];
				
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		Pair[] list = new Pair[N];
		for(int i = 0; i < N; i++){
			list[i] = new Pair(sc.nextInt(), sc.nextInt());
		}
		
		Arrays.sort(list, (p1, p2)->p2.d-p1.d);
		
		//for(Pair p : list) System.out.println(p.t + " " + p.d);
		
		long ansSum = 0;
		int ansType = 0;
		HashMap<Integer, Long> map = new HashMap<Integer, Long>();
		for(int i = 0; i < K; i++){
			ansSum += list[i].d;
			Long count = map.get(list[i].t);
			if(count == null) map.put(list[i].t, 1L);
			else map.put(list[i].t, count+1);
		}
		ansType = map.size();
		int index = K-1;
		
		long ans = (ansType*ansType + ansSum);
		
		if(K == N){
			System.out.println(ans);
			return;
		}
		
		//System.out.println("\n" + ansSum + " " + ansType + " " + (ansType*ansType + ansSum));
		
		Pair[] nokori = new Pair[N-K];
		for(int i = K; i < N; i++) nokori[i-K] = list[i];
		Arrays.sort(nokori, (p1, p2)->p1.compTD(p2));
		//for(Pair p : nokori) System.out.println(p.t + " " + p.d);
		for(Pair p : nokori){
			
			Long count = map.get(p.t);
			if(count != null) continue;
			//System.out.println("type" + " " + p.t);
			while(index >= 0){
				if(list[index].t != p.t){
					long cc = map.get(list[index].t);
					if(cc == 1){
						index--;
						continue;
					}
					
					long sum = ansSum - list[index].d + p.d;
					int type = ansType + 1;
					long res = (type*type + sum);
					ansSum = sum;
					ansType = type;
					ans = Math.max(ans, res);
					map.put(list[index].t, cc-1);
					map.put(p.t, 1L);
					index--;
					break;
				}
			}
		}
		
		System.out.println(ans);
		
	}//end main
	
}//end Main

class Pair{
	int t, d;
	public Pair(int t, int d){
		this.t = t; this.d = d;
	}
	
	public int compTD(Pair p){
		if(this.d != p.d){
			return p.d - this.d;
		}else{
			return p.t - this.t;
		}
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
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
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}
