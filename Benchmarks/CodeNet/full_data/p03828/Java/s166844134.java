import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		
		int n = sc.nextInt();

		FastPrimeFactorization pf = new FastPrimeFactorization(n);
		
		System.out.println(pf.factorialFactorNum(n));
	}
	
}

//エラトステネスの篩を作成すると同時に、それぞれの数について最小の素因数を覚えておくことでO(logn)くらいで素因数分解できる（篩の作成にO(nloglogn)）
class FastPrimeFactorization {
	
	static int[] minFactor; //index+2が持つ最小の素因数,素数なら0(i.e.qの最小素因数が知りたければq-2を見る）
	static ArrayList<Integer> primeNum;
	
	//nまでの整数の素数判定テーブルを作成(O(nloglogn))
	public FastPrimeFactorization(int n){
		boolean[] isPrime; //index+2が素数かどうか(i.e.qが素数か知りたければq-2を見る）
		if(n==0){
			isPrime = new boolean[0];
			minFactor = new int[0];
		}
		else{
			isPrime = new boolean[n-1];
			minFactor = new int[n-1];
			for(int i=0;i<n-1;i++){
				minFactor[i] = i+2;
			}
		}
		Arrays.fill(isPrime, true);
		
		//素数定理でnまでの素数の数を見積もってprimeNumの初期サイズを設定
		double pros = (double) n / Math.log(n);
		if(n==1){ pros = 0;}
		primeNum = new ArrayList<Integer>(Math.min((int)pros,Integer.MAX_VALUE)); 
		
		double root = Math.sqrt(n);
		
	    for(int i=2; i<=root; i++) {
	        if(isPrime[i-2]) {
	        	primeNum.add(i);
	            for (int j=i*2; j<=n; j+=i) {
	                isPrime[j-2] = false;
	                if(minFactor[j-2]==j){
		                minFactor[j-2] = i;
	                }
	            }
	        }
	    }
	    
	    for(int i=(int)root+1;i<=n;i++){
	    	if(isPrime[i-2]){
	    		primeNum.add(i);
	    	}
	    }
	}
	
	//nが素数かどうか
	boolean isPrime(int n){
		return minFactor[n-2]==0;
	}
	
	//nの最小素因数
	static int minFactor(int n){
		return minFactor[n-2];
	}
	
	//素因数分解
	ArrayList<Integer> primeFactorization(int n) {
		ArrayList<Integer> l = new ArrayList<>();
		
		while(n!=1){
			int p = minFactor(n);
			n /= p;
			l.add(p);
		}
		
		return l;
	}
	
	//n!の約数の個数（mod1000000007）
	int factorialFactorNum(int n){
		int mod = 1000000007;
		HashMap<Integer,Integer> map = new HashMap<>();
		
		while(n!=1){
			int m = n;
			while(m!=1){
				int p = minFactor(m);
				m /= p;
				if(!map.containsKey(p)){
					map.put(p,2);
				}
				else{
					map.put(p,map.get(p)+1);
				}
			}
			n--;
		}
		
		long ans = 1;
		for(int i:map.values()){
			ans*=i;
			ans%=mod;
		}
		
		return (int)ans;
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