
import java.io.*;
import java.util.*;
 
public class Main{
	int N;
	String S;
	int[][][] memo;
	public void solve(){
		N = nextInt();
		S = next();
		memo = new int[2][2][N];
		for(int i = 0; i < N; i++){
			memo[0][0][i] = -1;
			memo[0][1][i] = -1;
			memo[1][0][i] = -1;
			memo[1][1][i] = -1;
		}
		int pp = S.charAt(0) - '0';
		int prev = S.charAt(1) - '0';
		out.println(dfs(pp, prev, 2));
	}
	
	public int dfs(int pp, int prev, int idx){
		if(idx == S.length()){
			return 0;
		}
		if(memo[pp][prev][idx] != -1){
			return memo[pp][prev][idx];
		}
		int val;
		if(S.charAt(idx) == '0'){
			val = dfs(prev, 0, idx + 1);
		}else{
			if(pp == 1 && prev == 0){
				val = Math.max(dfs(0, 1, idx + 1), dfs(1, 0, idx + 1) + 1);
			}else{
				val = dfs(prev, 1, idx + 1);
			}
		}
		return memo[pp][prev][idx] = val;
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