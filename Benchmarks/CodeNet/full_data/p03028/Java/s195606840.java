import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main implements Runnable {
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        
        boolean[][] isWin = new boolean[n][n];

        for(int i=1;i<n;i++){
        	
    		char[] v = sc.next().toCharArray();
    		
        	for(int j=0;j<i;j++){
        		if(v[j]=='1'){
            		isWin[i][j] = false;
            		isWin[j][i] = true;
        		}
        		else{
            		isWin[i][j] = true;
            		isWin[j][i] = false;
        		}
        	}
        }
        
        ArrayList<Integer> list = new ArrayList<>(); //[0,i]で勝ちうる人のidxをlistへ格納
        list.add(0);
        
        for(int i=1;i<n;i++){
        	int canWinMax = i;
        	
        	loop:for(int j=i-1;j>=0;j--){
        		if(isWin[j][i]==true){
        			canWinMax = j;
        			break loop;
        		}
        	}
        	
        	boolean caniWin = false;
        	for(int win:list){
        		if(isWin[i][win] = true){
        			caniWin = true;
        			break;
        		}
        	}
        	
        	loop2:for(int idx=0;idx<list.size();idx++){
        		int win = list.get(idx);
        		if(win>canWinMax){
        			list.remove(idx);
        		}
        	}
        	
        	
        	if(caniWin){
        		list.add(i);
        	}
        	
        	
        }
        
        System.out.println(list.size());
        
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
		} else {
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
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}