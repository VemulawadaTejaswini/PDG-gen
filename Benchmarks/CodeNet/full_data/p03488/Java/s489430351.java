import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	//PrintWriter out;
	final int MOD = 1000000007;
	
	/* solve */
	void solve(){
		String s = sc.next();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		ArrayList<Integer> xList = new ArrayList<>();
		ArrayList<Integer> yList = new ArrayList<>();
		String[] list = s.split("T");
		for(int i = 0; i < list.length; i++){
			//System.out.println("\"" + list[i] + "\"");
			if(i % 2 == 0) xList.add(list[i].length());
			else yList.add(list[i].length());
		}
		
		boolean[][] dpX = new boolean[xList.size()+1][s.length() * 2 + 2];
		boolean[][] dpY = new boolean[yList.size()+1][s.length() * 2 + 2];
		//相対座標を計算するための差分
		int rel = s.length();
		
		dpX[0][0+rel] = true;
		for(int i = 0; i < xList.size(); i++){
			for(int j = -s.length(); j <= s.length(); j++){
				if(dpX[i][j+rel]){
					if(i == 0){
						dpX[i+1][j+xList.get(i)+rel] = true;
					}else{
						dpX[i+1][j+xList.get(i)+rel] = true;
						dpX[i+1][j-xList.get(i)+rel] = true;
					}
				}
			}
		}
		
		if(!dpX[xList.size()][x+rel]){
			System.out.println("No");
			return;
		}
		
		dpY[0][0+rel] = true;
		for(int i = 0; i < yList.size(); i++){
			for(int j = -s.length(); j <= s.length(); j++){
				if(dpY[i][j+rel]){
					dpY[i+1][j+yList.get(i)+rel] = true;
					dpY[i+1][j-yList.get(i)+rel] = true;
				}
			}
		}
		
		if(!dpY[yList.size()][y+rel]){
			System.out.println("No");
			return;
		}
		
		System.out.println("Yes");
	}
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws IOException {
		new Main().m();
	}
	
	void m() throws IOException {
		long S = System.currentTimeMillis();
		sc = (isDebug) ? new FastScanner(new FileInputStream(fileName)) : new FastScanner(System.in);
		//out = new PrintWriter(System.out);
		solve();
		//out.flush();
		long G = System.currentTimeMillis();
		if(isDebug){
			System.out.println("---Debug---");
			System.out.printf("%7d ms", (G-S));
		}
	}
	/* end main */
}
/* end Main */

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
