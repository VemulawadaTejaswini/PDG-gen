
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;



class Main {

	
	public static void main(String[] argv){
		FastScanner sc = new FastScanner();
		
		int n = sc.nextInt();
		Range[] tRanges = new Range[n];
		Range[] aRanges = new Range[n];
		
		int last = 1;
		for(int i = 0;i<n;i++){
			int tmp = sc.nextInt();
			if(tmp > last){
				tRanges[i] = new Range(tmp,tmp);
			}else{
				tRanges[i] = new Range(1, tmp);
			}
			last = tmp;
		}
		
		int[] temp = new int[n];
		for(int i = 0;i<n;i++){
			temp[i] = sc.nextInt();
		}
		last = 1;
		for(int i = 0;i<n;i++){
			int tmp = temp[n-1-i];
			if(tmp > last){
				aRanges[n-1-i] = new Range(tmp,tmp);
			}else{
				aRanges[n-1-i] = new Range(1, tmp);
			}
			last = tmp;
		}
		
		long ans = 1;
		
		for(int i = 0;i<n;i++){
			int min,max;
//			System.out.println(tRanges[i].min+ " "+ tRanges[i].max);
//			System.out.println(aRanges[i].min+ " "+ aRanges[i].max);
			min = Math.max(tRanges[i].min, aRanges[i].min);
			max = Math.min(tRanges[i].max, aRanges[i].max);
			if(min > max){
				ans *= 0;
			}
//			System.out.println(min + " " + max + " " + ans);
			ans *= (max - min + 1) %  1000000007;
			ans %= 1000000007;
		}
		System.out.println(ans);
	}


}

class Range{
	public int min,max;
	public Range(int min,int max){
		this.min = min;
		this.max = max;
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
