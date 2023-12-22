import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);
		//FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		int[] prime = new int[100];
		
		for(int j = 1; j <= N; j++){
			//System.out.print(j + " ");
			int n = j;
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					int count = 0;
					while (n % i == 0) {
						n /= i;
						count++;
					}
					//System.out.print(i + " ^ " + count + " ");
					prime[i] += count;
				}
			}
			if(n > 1){
				//System.out.print(n + " ^ " + 1);
				prime[n] += 1;
			}
			//System.out.println();
		}
		
		for(int p : prime){
			//if(p != 0) System.out.print(p + " ");
			System.out.print(p + " ");
		}
		System.out.println();
		/*
		 * 75
		 * = 75 = (74 + 1)
		 * = 3 5 5 = (2 + 1) * (4 + 1) * (4 + 1)
		 * = 5 15 = (4 + 1) 
		 * = 3 25
		 */
		int sum75 = 0;
		int sum355 = 0;
		int sum515 = 0;
		int sum325 = 0;
		long ans = 0;
		for(int i = 2; i <= 97; i++){
			for(int j = i + 1; j <= 97; j++){
				for(int k = j + 1; k <= 97; k++){
					if(prime[i] >= 75 && prime[j] >= 1 && prime[k] >= 1) ans++;
					if(prime[i] >= 15 && prime[j] >= 5 && prime[k] >= 1) ans++;
					if(prime[i] >= 25 && prime[j] >= 3 && prime[k] >= 1) ans++;
					if(prime[i] >= 5 && prime[j] >= 5 && prime[k] >= 3) ans++;
				}
			}
		}
		System.out.println(ans);
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
