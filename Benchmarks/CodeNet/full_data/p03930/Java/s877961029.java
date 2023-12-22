import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	static int[][] X;
	static int[][] x;
	static int combo = 0;
	static int h; 
	static int w;
	static int k;
	static int p;
	static int point;
	public static void main(String[] args) throws Exception{	
		FastScanner sc = new FastScanner();
		int i, j;
			//code
		
		h = sc.nextInt();
		w = sc.nextInt();
		k = sc.nextInt();
		
		X = new int[h][w];
		x = new int[h][w];
		String tmp = new String();
		for(i=0; i<h; i++){
			tmp = sc.next();
			for(j=0; j<w; j++){
				X[i][j] = Integer.parseInt(tmp.substring(j, j+1));
			}
		}

		
		
		int P=0;
		
		for(i=0; i<w; i++){
			resetx();
			
			del(i);
			while(true){
				if(chk() == 1){
					del_a();
				}else{
					break;
				}
			}
			
			if(point > P){
				P = point;
			}
			point = 0;
			combo = 0;
		}
		
		pl(P);
		
		
	
	}
	
	static void del(int wx){
		for(int i=h-1; i>0; i--){
			x[i][wx] = x[i-1][wx];
		}
		x[0][wx] = -1;
	}
	
	static int chk(){
		p=0;
		for(int i=0; i<h; i++){
			for(int j=0; j<w-k+1; j++){
				int n=1;
				if(x[i][j] != -1){
					for(int l=0; l<w; l++){
						if(j+1+l >= w) break;
						if(x[i][j+l] == x[i][j+1+l]){
							n++;
						}
						else break;
					}
					if(n >= k){
						p += x[i][j] * n;
						for(int l=j; l<j+n; l++){
							x[i][l] = -1;
						}
					}
				}
			}
		}
		if(p == 0) return 0;
		
		point += Math.pow(2, combo++) * p;
		return 1;
	}
	
	static void del_a(){
		for(int i=h-1; i>0; i--){
			for(int j=0; j<w; j++){
				if(x[i][j] == -1){
					int n=0;
					while(true){
						if(i-1-n < 1) break;
						if(x[i-1-n][j] == -1) n++;
						else break;
					}
					x[i][j] = x[i-1-n][j];
					x[i-1-n][j] = -1;
				}
			}
		}
	}
	
	static void resetx(){
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				x[i][j] = X[i][j];
			}
		}
	}
	
	static void showx(){
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				p(" " + x[i][j]);
			}
			pl("");
		}
		pl("\n\n\n");
	}
	
	static void p(String s){ System.out.print(s); }
	static void pl(String s){ System.out.println(s); }
	static void p(int s){ System.out.print(s); }
	static void pl(int s){ System.out.println(s); }
	static void p(long s){ System.out.print(s); }
	static void pl(long s){ System.out.println(s); }
	static void p(double s){ System.out.print(s); }
	static void pl(double s){ System.out.println(s); }
	static void p(boolean s){ System.out.print(s); }
	static void pl(boolean s){ System.out.println(s); }
	

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
