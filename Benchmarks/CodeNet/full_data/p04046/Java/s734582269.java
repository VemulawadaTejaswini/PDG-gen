import java.io.*;
import java.util.*;
class Main{
	static int mod = (int) 1e9 + 7;
    public static void main(String[] args) throws Exception {
		hayami saori = new hayami();
		int H = saori.saori_hayami();
		int W = saori.saori_hayami();
		int A = saori.saori_hayami();
		int B = saori.saori_hayami();
		
		Combination com = new Combination(200000);
		long ans = 0;

		for (int i = 1; 0 <= H - A - i && B + i <= W; i++) {
		    ans += (com.getComb((H - A - i) + (B + i - 1), (H - A - i)) * com.getComb(H - (H - A - i) + W - (B + i - 1) - 2, H - (H - A - i) - 1)) % mod;
		    ans %= mod;
		}
		System.out.println(ans);
	}
}

class Combination {
    static final int MOD = 1000000007;
    long[] fac;
    long[] finv;
    long[] inv;
    
    public Combination (int size) {
        fac = new long [size];
        finv = new long [size];
        inv = new long [size];
        fac[0] = 1;
        fac[1] = 1;
        finv[0] = 1;
        finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < size; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }
    
    
    public long getComb(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }
    
    public static void main(String[] args) {
        Combination com = new Combination(10);
        System.out.println(com.getComb(2, 1));
    }
}

class hayami implements Closeable {
	private final InputStream in = System.in;
	private final byte[] hayami = new byte[1024];
	private int Hayami = 0;
	private int saori = 0;
	private boolean HayamiSaori() {
		if (Hayami < saori) {
			return true;
		}else{
			Hayami = 0;
			try {
				saori = in.read(hayami);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (saori <= 0) {
				return false;
			}
		}
		return true;
	}
	private int SaoriHayami() { 
		if (HayamiSaori()) {
            return hayami[Hayami++];
         }else{
             return -1;
         }
	}
	private static boolean hayami_saori(int hayami) { 
		return 33 <= hayami && hayami <= 126;
	}
	public boolean hayamisaori() { 
		while(HayamiSaori() && !hayami_saori(hayami[Hayami])) Hayami++; return HayamiSaori();
	}
	public String nextHayami() {
		if (!hayamisaori()) throw new NoSuchElementException();
		StringBuilder hayamin = new StringBuilder();
		int saori = SaoriHayami();
		while(hayami_saori(saori)) {
			hayamin.appendCodePoint(saori);
			saori = SaoriHayami();
		}
		return hayamin.toString();
	}
	public long saorihayami() {//nextLong
		if (!hayamisaori()) throw new NoSuchElementException();
		long hayami = 0;
		boolean misao = false;
		int saori = SaoriHayami();
		if (saori == '-') {
			misao = true;
			saori = SaoriHayami();
		}
		if (saori < '0' || '9' < saori) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= saori && saori <= '9') {
				hayami *= 10;
				hayami += saori - '0';
			}else if(saori == -1 || !hayami_saori(saori)){
				return misao ? -hayami : hayami;
			}else{
				throw new NumberFormatException();
			}
			saori = SaoriHayami();
		}
	}
	public int saori_hayami() {//nextInt
		long hayami = saorihayami();
		if (hayami < Integer.MIN_VALUE || hayami > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) hayami;
	}
	public double Hayamin() { //nextDouble
		return Double.parseDouble(nextHayami());
	}
	public void close() {
		try {
			in.close();
		} catch (IOException e) {
		}
    }
}

class stackover{
	static int mod = (int) 1e9 + 7;
	public static long combination(long n,long c){
        if(c == 0){
            return 1;
        }
		return (combinationapp(n, c)/combinationdown(c))%mod;
    }
    
    public static long combinationapp(long n,long c){
		if(c == 1){
			return n;
		}
		return (n * combinationapp(n-1, c-1))%mod;
    }

	public static long combinationdown(long c){
		if(c == 1){
			return c;
		}
		return (c * combinationdown(c-1))%mod;
	}

	public static int check(int a,int b){
		if(a/2 < b){
			b = a-b;
		}
		return b;
	}

	public static void tamesi(int a){
		hayami saori = new hayami();
		int H = saori.saori_hayami();
		int W = saori.saori_hayami();
		int A = saori.saori_hayami();
		int B = saori.saori_hayami();
		int n = W-B;
		long[] root = new long[n];

		int cl1 = 0;
		int cl2 = 0;
		int cr1 = 0;
		int cr2 = 0;
		int cl3 = 0;
		int cr3 = 0;
		
		long ans = 0;

		for(int i = 0;i < n;i++){
			cl1 = B+i+H-1-A;
			cr1 = B+i;
			cl2 = W-B-1-i+A;
			cr2 = W-B-1-i;
			cl3 = B+i+H-1-A-1;
			cr3 = B+i-1;
			cr1 = check(cl1, cr1);
			cr2 = check(cl2, cr2);
			cr3 = check(cl3, cr3);
			if(i == 0){
				root[i] = combination(cl1, cr1)*combination(cl2,cr2);
			} else {
				root[i] = (combination(cl1, cr1) - combination(cl3, cr3))*combination(cl2,cr2);
			}
		}

		for(int i = 0;i < root.length;i++){
			ans = ans + root[i];
		}
		System.out.println(ans);
	}
}