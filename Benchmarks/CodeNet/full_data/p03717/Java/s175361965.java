
import java.io.*;
import java.util.*;
 
public class Main{
	int N, M;
	ArrayList<ArrayList<Pair>> pairs;
	long mod = 1000000007;
	int[][][] memo;
	class Pair{
		int l, r, x;
		public Pair(int l, int r, int x){
			this.l = l;
			this.r = r;
			this.x = x;
		}
	}
	
	public void solve(){
		N = nextInt();
		M = nextInt();
		pairs = new ArrayList<>(N);
		for(int i = 0; i < N; i++){
			pairs.add(new ArrayList<>());
		}
		
		for(int i = 0; i < M; i++){
			Pair p = new Pair(nextInt() - 1, nextInt() - 1, nextInt());
			pairs.get(p.r).add(p);
		}
		memo = new int[N + 2][N + 2][N + 2];
		for(int i = 0; i < memo.length; i++){
			for(int j = 0; j < memo[i].length; j++){
				for(int k = 0; k < memo[i][j].length; k++){
					memo[i][j][k] = -1;
				}
			}
		}
		out.println(dfs(-1, -1, -1));
	}
	
	public int dfs(int r, int g, int b)	{
		if(memo[r + 1][g + 1][b + 1] != -1){
			return memo[r + 1][g + 1][b + 1];
		}
		int[] arr = {r, g, b};
		Arrays.sort(arr);
		int idx = arr[2] + 1;
		
		
		if(idx > 0){
			for(Pair p : pairs.get(idx - 1)){
				if(p.x == 1){
					if(arr[1] < p.l){
						
					}else{
						return 0;
					}
				}else if(p.x == 2){
					if(arr[1] >= p.l && arr[0] < p.l){
						
					}else{
						return 0;
					}
				}else if(p.x == 3){
					if(arr[0] >= p.l){
						
					}else{
						return 0;
					}
				}
			}
		}
		
		if(idx == N) return 1;
		
		long ans = dfs(idx, g, b);
		ans += dfs(r, idx, b);
		ans += dfs(r, g, idx);
		
		return memo[r + 1][g + 1][b + 1] = (int)(ans % mod);
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