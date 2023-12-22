
import java.io.*;
import java.util.*;
 
public class Main{
	boolean[][] memo;
	int A, B, C, D, E, F;
	public void solve(){
		A = nextInt();
		B = nextInt();
		C = nextInt();
		D = nextInt();
		E = nextInt();
		F = nextInt();

		memo = new boolean[F / 100 + 1][F + 1];
			
		dfs(0, 0);
		double max = 0;
		int maxi = A;
		int maxj = 0;
		for(int i = 0; i < memo.length; i++){
			for(int j = 0; j < memo[i].length; j++){
				if(i + j == 0) continue;
				if(memo[i][j]){
					if(E * i >= j && max < (double)j /(i * 100 + j)){
						max = (double)j /(i * 100 + j);
						maxi = i;
						maxj = j;
					}
				}
			}
		}
		out.printf("%d %d\n", maxi * 100 + maxj, maxj);
	}
	public void dfs(int water, int suger){
		if(water * 100 + suger > F) return;
		if(memo[water][suger]) return;
		memo[water][suger] = true;
		dfs(water +  A, suger);
		dfs(water +  B, suger);
		dfs(water, suger + C);
		dfs(water, suger + D);
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