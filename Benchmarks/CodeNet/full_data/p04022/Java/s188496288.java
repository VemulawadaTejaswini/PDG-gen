
import java.io.*;
import java.util.*;
 
public class Main{
	class Num implements Comparable<Num>{
		int[] m;
		final int h;
		boolean zero = false;
		int key;
		public Num(int value){
			m = new int[prime.length + 1];
			int sum = 0;
			key = 1;
			for(int i = 0; i < prime.length; i++){
				int cnt = 0;
				while(value % prime[i] == 0){
					value /= prime[i];
					cnt++;
				}
				m[i] = cnt % 3;
				sum += m[i];
				int kk = 1;
				for(int j = 0; j < m[i]; j++){
					kk *= prime[i];
				}
				key *= kk;
			}
			m[prime.length] = value - 1;
			
			h = Arrays.hashCode(m);
			zero = sum == 0;
		}
		public Num(int[] mm){
			this.m = mm;
			h = Arrays.hashCode(m);
		}
		
		public Num inv(){
			int[] m2 = new int[prime.length + 1];
			for(int i = 0; i < prime.length; i++){
				m2[i] = ((3 - m[i]) % 3);
			}
			m2[prime.length] = -m[prime.length];
			return new Num(m2);
		}
		
		@Override
		public int hashCode() {
			return h;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Num))
				return false;
			Num other = (Num) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (!Arrays.equals(m, other.m))
				return false;
			return true;
		}
		private Main getOuterType() {
			return Main.this;
		}
		public boolean isZero() {
			return zero;
		}
		@Override
		public int compareTo(Num o) {
			return Integer.compare(key, o.key);
		}
		

	}
	int N;
	int[] prime;
	TreeMap<Num, Integer> value;
	public void solve(){
		prime = createPrime(10000);
		value = new TreeMap<>();
		N = nextInt();
		for(int i = 0; i < N; i++){
			int v = nextInt();
			Num n = new Num(v);
			Integer val = value.get(n);
			if(val == null){
				val = 1;
			}else{
				val = val + 1;
			}
			value.put(n, val);
		}
		int ans = 0;
		while(!value.isEmpty()){
			Map.Entry<Num, Integer> e = value.firstEntry();
			if(e.getKey().isZero()){
				ans += 1;
				value.remove(e.getKey());
			}else{
			
				Num inv = e.getKey().inv();
				Integer ii = value.get(inv);
				if(ii == null || ii < e.getValue()){
					ans += e.getValue();
				}else{
					ans += ii;
				}
				value.remove(e.getKey());
				value.remove(inv);
			}
		}
		out.println(ans);
		
	}
	
	public int[] createPrime(int max){
		boolean[] f = new boolean[max + 1];
		for(int i = 2; i * i <= max; i++){
			if(!f[i]){
				for(int j = i * i; j <= max; j += i){
					f[j] = true;
				}
			}
		}
		
		int cnt = 0;
		for(int i = 2; i <= max; i++){
			if(!f[i]){
				cnt++;
			}
		}
		
		int[] primes = new int[cnt];
		int idx = 0;
		for(int i = 2; i <= max; i++){
			if(!f[i]){
				primes[idx++] = i;
			}
		}
		return primes;
	}
	
	private static PrintWriter out;
	public static void main(String[] args){
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}
	
	
	
	public static int nextInt(){
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}
	
	public static long nextLong(){
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}
	public static String next(){
		int c;
		while(!isAlNum(c = read())){}
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	
	
	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;
	private static int read(){
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}
	
	private static boolean isAlNum(int c){
		return '!' <= c && c <= '~';
	}
}