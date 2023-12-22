
import java.io.*;
import java.util.*;
 
public class Main{
	
	class Pair implements Comparable<Pair>{
		int idx;
		int value;
		public Pair(int idx, int value){
			this.idx = idx;
			this.value = value;
		}
		@Override
		public int compareTo(Pair o) {
			if(value != o.value){
				return Integer.compare(value, o.value);
			}
			
			return Integer.compare(o.idx, idx);
		}
	}
	
	int N;
	int[] A;
	public void solve(){
		N = nextInt();
		A = new int[3 * N];
		for(int i = 0; i < 3 * N; i++){
			A[i] = nextInt();
		}
	
		PriorityQueue<Integer> mae = new PriorityQueue<Integer>();
		TreeSet<Pair> ushiro = new TreeSet<>();
		long sum = 0;
		for(int i = 0; i < N; i++){
			mae.add(A[i]);
			sum += A[i];
		}
		Pair[] pairs = new Pair[3 * N];
		for(int i = N; i < 3 * N; i++){
			ushiro.add(pairs[i] = new Pair(i, A[i]));
		}
		Iterator<Pair> ite = ushiro.iterator();
		long sum2 = 0;
		Pair last = null;
		for(int i = 0; i < N; i++){
			last = ite.next();
			sum2 += last.value;
		}
		
		
		long ans = Long.MIN_VALUE;
		
		for(int i = N; i < 2 * N; i++){
			mae.add(A[i]);
			int v = mae.poll();
			sum += A[i] - v;
			
			ushiro.remove(pairs[i]);
			
			if(pairs[i].compareTo(last) <= 0){
				sum2 -= pairs[i].value;
				last = ushiro.higher(last);
				sum2 += last.value;
			}
			
			ans = Math.max(ans, sum - sum2);
		}
		
		out.println(ans);
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