
import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;

public class Main {
	int N;
	int[] A;
	ArrayList<HashMap<Integer, Integer>> memo;
	
	public int dfs(int i, int min){
		if(i >= N) return 0;
		if(memo.get(i).containsKey(min)){
			return memo.get(i).get(min);
		}
		int nn = (A[i] - 1) / min;
		int ans = dfs(i + 1, Math.max(min, A[i] + 1));
		for(int cnt = nn; cnt > 0; cnt--){
			int val = A[i] / nn;
			int m = (A[i] - 1) % cnt + 2;
			ans = Math.max(ans, dfs(i + 1, Math.max(min, m)) + cnt);
		}
		memo.get(i).put(min, ans);
		return ans;
	}
	
	public void solve() {
		N = nextInt();
		A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = nextInt();
		}
		memo = new ArrayList<>(N);
		for(int i = 0; i < N; i++){
			memo.add(new HashMap<>());
		}
		
		int ans = 0;
		int price = 1;
		for(int i = 0; i < N; i++){
			int nn = (A[i] - 1) / price;
			if(nn == 0){
				price = Math.max(price, A[i] + 1);
			}else{
				int m = (A[i] - 1) % nn + 2;
				price = Math.max(price, m);;
				ans += nn;
			}
		}
		
		out.println(ans);
		
	}
	private static PrintWriter out;

	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}

	public static int nextInt() {
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(; i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}

	public static long nextLong() {
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(; i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}

	public static String next() {
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

	private static int read() {
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return(bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}

	private static boolean isAlNum(int c) {
		return '!' <= c && c <= '~';
	}
}
