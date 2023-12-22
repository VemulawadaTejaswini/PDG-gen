
import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;
 
public class Main{
	
	long N, A;
	long[] memo = new long[1000010];
	
	public long dfs2(int x){
		if(x <= 0) return 0;
		if(x == 1){
			return 1;
		}
		if(memo[x] != 0) return memo[x];
		
		long ret = x;
		for(int i = 2; i < x - A; i++){
			long v = dfs2(i) * (x - i - A);
			ret = Math.max(ret, v);
		}
		return memo[x] = ret;
	}
	
	public void m(){
		ArrayList<Integer> arr = new ArrayList<>();
		TreeMap<Integer, Integer> tree = new TreeMap<>();
		int prev = (int)(N + 1) / 2;
		prev = (int)N;
		for(int i = 2; i <= N; i++){
			int np = ((int)N + i - 1
					) / i;
			if(np != prev){
				arr.add(np);
				prev = np;
			}
		}
		Collections.reverse(arr);
		tree.put(0, 1);
		for(int i = 1; i < arr.size(); i++){
			int v1 = arr.get(i - 1);
			int v2 = arr.get(i);
			Map.Entry<Integer, Integer> en = tree.floorEntry(v1);
			int k1 = en.getKey(); int vv1 = en.getValue();
			int b1 = (v1 + vv1 - 1) / vv1 + k1;
			en = tree.floorEntry(v2);
			k1 = en.getKey();  vv1 = en.getValue();
			int b2 = (v2  + vv1 - 1) / vv1 + k1;
			
			int t = (v1 * b1 - v2 * b2) / (v1 - v2);
			tree.put(t, v2);
		}
		long min = Integer.MAX_VALUE;
		for(Map.Entry<Integer, Integer> en : tree.entrySet()){
			int k1 = en.getKey(); int vv1 = en.getValue();
			min = Math.min((N + vv1 - 1) / vv1 + k1, min);
		}
		out.println(min);
	}
	
	public void solve(){
		N = nextLong();
		A = nextLong();
		m();

		
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