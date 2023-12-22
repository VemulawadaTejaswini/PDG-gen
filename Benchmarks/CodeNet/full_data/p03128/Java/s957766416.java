import java.io.*;
import java.util.*;

public class Main {
	
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	//PrintWriter out;
	final int MOD = (int)1e9+7;
	final int INF = Integer.MAX_VALUE / 2;
	
	/* solve */
	void solve(){
		int[] p = {2, 5, 5, 4, 5, 6, 3, 7, 6};
		boolean[] ex = new boolean[9];
		int N = sc.nextInt();
		int M = sc.nextInt();
		Pair[] list = new Pair[M];
		for(int i = 0; i < M; i++){
			int A = sc.nextInt()-1;
			ex[A] = true;
			list[i] = new Pair(A, p[A]);
		}
		Arrays.sort(list, (p1, p2)->p1.use - p2.use);
		
		if(N % list[0].use == 0){
			int num = N / list[0].use;
			for(int i = 0; i < num; i++){
				System.out.print(list[0].A+1);
			}
			System.out.println();
			return;
		}
		
		HashMap<Integer, Part> set = new HashMap<>();
		
		
		ArrayList<Part> part = new ArrayList<Part>();
		
		for(int bit = 0b111111111; bit >= 1; bit--){
			boolean isOk = true;
			int sum = 0;
			int b = bit;
			ArrayList<Integer> use = new ArrayList<>();
			for(int i = 0; i < 9; i++){
				if(b % 2 == 1){
					if(!ex[i]) isOk = false;
					sum += p[i];
					use.add(i);
				}
				b /= 2;
			}
			if(isOk){
				Part pp = set.get(sum);
				Part ne = new Part(sum, use);
				if(pp == null) set.put(sum, ne);
				else if(pp.use.size() < ne.use.size()) set.put(sum, ne);
			}
		}
		
		for(Pair pp : list){
			int num = N / pp.use;
			int m = N % pp.use;
			
			while(num > 0){
				if(set.containsKey(m)){
					ArrayList<Integer> use = set.get(m).use;
					use.add(pp.A);
					Collections.sort(use, Collections.reverseOrder());
					for(int u : use){
						if(u == pp.A){
							for(int i = 0; i < num; i++) System.out.print(u+1);
						}else{
							System.out.print(u+1);
						}
					}
					System.out.println();
					return;
					
				}else{
					m += list[0].use;
					num--;
				}
			}
		}
		
		
		
		
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
			System.out.printf("%8d ms", (G-S));
		}
	}
	/* end main */
}
/* end Main */

class Pair{
	int A, use;
	public Pair(int a, int u){
		A = a; use = u;
	}
}

class Part{
	int num;
	ArrayList<Integer> use;
	public Part(int n, ArrayList<Integer> u){
		num = n; use = u;
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
