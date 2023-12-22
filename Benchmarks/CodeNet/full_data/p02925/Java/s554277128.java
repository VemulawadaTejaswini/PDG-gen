
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FastScanner fc = new FastScanner();
		
//		int n = Integer.parseInt(br.readLine());
		int n = fc.nextInt();

		int[][] games = new int[n][n - 1];

		for(int i = 0; i < n; i++){
//			String[] tmpArray = br.readLine().split(" ");

			for(int j = 0; j < n - 1; j++){
//				games[i][j] = Integer.parseInt(tmpArray[j]) - 1;
				games[i][j] = fc.nextInt() - 1;
			}
		}

		int current[] = new int[n];
		boolean done[] = new boolean[n];
		int count = 1;
		while(true){
			//			System.out.println("date "+count);
			Arrays.fill(done, false);

			boolean matched = false;
			for(int i = 0; i < n ; i++){
				if(done[i] || current[i] >= n - 1){
					continue;
				}

				int target = games[i][current[i]];


				if(!done[target] && current[target] < n - 1 && games[target][current[target]] == i){
					//					System.out.println(i + " vs "+target);
					done[i] = true;
					done[target] = true;
					current[i]++;
					current[target]++;
					matched = true;
				}
			}
			if(!matched){
				System.out.println(-1);
				return;
			}

			boolean finished = true;
			for(int i = 0; i < n; i++){
				if(current[i] < n - 1){
					finished = false;
					break;
				}
			}

			if(finished){
				break;
			}

			count++;
		}

		System.out.println(count);
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
