
import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;
 
public class Main{
	public void solve(){
		int N = nextInt();
		int ans = lowerBound(0, N, v ->{
			int cur = v;
			int sum = N;
			while(sum != 0 && cur > 0){
				if(sum >= cur){
					sum -= cur;
					cur--;
				}else{
					sum = 0;
					break;
				}
			}
			return sum == 0;
		});
		int cur = ans;
		int sum = N;
		while(sum != 0 && cur > 0){
			if(sum >= cur){
				sum -= cur;
				out.println(cur);
				cur--;
			}else{
				out.println(sum);
				sum = 0;
				break;
			}
		}
	}

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