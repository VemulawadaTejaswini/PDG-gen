import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;
 
public class Main{
	
	int N, M;
	int[] X, Y;
	final long MOD = 1000000007;
	public void solve(){
		N = nextInt();
		M = nextInt();
		X = new int[N];
		Y = new int[M];
		for(int i = 0; i < N; i++){
			X[i] = nextInt();
		}
		for(int i = 0; i < M; i++){
			Y[i] = nextInt();
		}
		Arrays.sort(X);
		long sum = 0;
		long prev = 0;
		for(int i = 1; i < N; i++){
			long d = X[i] - X[i - 1];
			prev = ((d * i) % MOD + prev) % MOD;
			sum = (sum + prev) % MOD;
		}
		Arrays.sort(Y);
		long sum2 = 0;
		prev = 0;
		for(int i = 1; i < M; i++){
			long d = Y[i] - Y[i - 1];
			prev = ((d * i) % MOD + prev) % MOD;
			sum2 = (sum2 + prev) % MOD;
		}
		out.println((sum * sum2) % MOD);
	}
	
	public int[] count(String str){
		int[] cnt = new int[256];
		for(int i = 0; i < str.length(); i++){
			cnt[str.charAt(i)]++;
		}
		return cnt;
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