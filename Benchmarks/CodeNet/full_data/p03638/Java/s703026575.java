import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		int h=scanner.nextInt();
		int w=scanner.nextInt();
		int n=scanner.nextInt();
		Map<Integer,Integer>map=new TreeMap<>();
		for(int i=1;i<=n;i++){
			int a=scanner.nextInt();
			map.put(i, a);
		}
		int[][] grid=new int[h][w];
		for(int i=0;i<h;i++){
			if(i%2==0){
				for(int j=0;j<w;j++){
					for(int key:map.keySet()){
						int val=map.get(key);
						if(val>0){
							grid[i][j]=key;
							map.put(key, val-1);
							break;
						}
					}
				}
			}else{
				for(int j=w-1;j>=0;j--){
					for(int key:map.keySet()){
						int val=map.get(key);
						if(val>0){
							grid[i][j]=key;
							map.put(key, val-1);
							break;
						}
					}
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				sb.append(grid[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
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
