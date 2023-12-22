
import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;
 
public class Main{
	
	long N, A;
	long[] memo = new long[1000010];
	long[] prev = new long[1000010];
	long dfs(long n){
		if(n == 1) return 1;
		if(memo[(int)n] != 0){
			return memo[(int)n];
		}
		
		long ans = n;
		long p = 1;
		for(int i = 2; i < n; i++){
			long nn = dfs(i) + A + (n + i - 1) / i;
			if(nn < ans){
				ans = nn;
				p = i;
			}
		}
		prev[(int)n] = p;
		return memo[(int)n] = ans;
	}
	
	public void solve(){
		N = nextLong();
		A = nextLong();
		if(N > 10000){
			out.println(0);
		}else{
			out.println(dfs(N));
		}
		/*
		for(int i = 1; i <= N; i++){
			out.printf("%4d %4d %4d\n", i, memo[i], prev[i]);
		}
		*/
	}
	
	/*
	int N, M;
	ArrayList<HashSet<Integer>> set;
	ArrayList<HashSet<Integer>> trans;
	public void solve(){
		N = nextInt();
		M = nextInt();
		set = new ArrayList<>(N);
		trans = new ArrayList<>(M);
		for(int i = 0; i < M; i++){
			trans.add(new HashSet<>());
		}
		
		for(int i = 0; i < N; i++){
			int k = nextInt();
			HashSet<Integer> ss = new HashSet<>(k * 2);
			for(int j = 0; j < N; j++){
				ss.add(nextInt());
			}
			for(int a : ss){
				for(int b : ss){
					trans.get(a).add(b);
				}
			}
			set.add(ss);
		}
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < )
		}
	}
*/
	public int lowerBound(int begin, int end, IntPredicate check){
		int l = begin - 1;
		int r = end;
		while(r - l > 1){
			int m = (r + l) / 2;
			if(check.test(m)){
				r = m;
			}else{
				l = m;
			}
		}
		return r;
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