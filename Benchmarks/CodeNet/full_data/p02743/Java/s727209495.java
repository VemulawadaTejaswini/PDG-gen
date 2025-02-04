import java.io.*;
import java.util.*;
import java.math.BigInteger;
class Main{
	static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intMax 
	static final int INF = 1_000_000_000; // 10^9  
	static int mod =1000000007;
    public static void main(String[] args) throws Exception {
		hayami saori = new hayami();
		long a = saori.saorihayami();
		long b = saori.saorihayami();
		long c = saori.saorihayami();
		
		BigInteger result1 = BigInteger.valueOf(a);
		BigInteger result2 = BigInteger.valueOf(c);
		result1 = result1.multiply(BigInteger.valueOf(b));
		result2 = result2.multiply(BigInteger.valueOf(c));
		result1 = result1.multiply(BigInteger.valueOf(16));
		if(result2.compareTo(result1) == 1){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		saori.close();
	}
	public static long pow(long a, long b,int mod) {
		long ret = 1;
        long tmp = a;
        
		while (b > 0) {
			if ((b & 1) == 1)
				ret = (ret * tmp) % mod;
			tmp = (tmp * tmp) % mod;
			b = b >> 1;
		}
		return ret;
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