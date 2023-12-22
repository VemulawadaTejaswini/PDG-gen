import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		solution(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solution(String[] args) throws Exception{

		int N = nextInt();
		int[] C = new int[N];
		int[] S = new int[N];
		int[] F = new int[N];

		int sumC=0;
		for(int i=0;i<N-1;i++){
			C[i]=nextInt();
			S[i]=nextInt();
			F[i]=nextInt();
			sumC+=C[i];
		}

		int[] ans = new int[N];
		ans[0]=sumC+S[0];
		for(int i=1;i<N-1;i++){
			sumC-=C[i-1];
			ans[i]=(int)Math.max(Math.min(ans[i-1], lcm(S[i],F[i])),S[i])+sumC;
		}
		for(int i=N-2;i>=0;i--){
			ans[i]=Math.max(ans[i], ans[i+1]);
		}
		ans[N-1]=0;

		for(int i=0;i<N;i++){
			pw.println(ans[i]);
		}

	}

public static long lcm(long a, long b) {
	long x, y;

	return ((a / gcd(a, b)) * b);
}
public static long gcd(long a, long b) {
	long x, y;
	if (a < b) {
		x = b;
		y = a;
	} else {
		x = a;
		y = b;
	}
	long r;
	while ((r = a % b) != 0) {
		a = b;
		b = r;
	}
	return b;
}

	public static void check() throws Exception{
		if(in == null){
			in = new BufferedReader(new InputStreamReader(System.in));
		}
		if(Ws==null || Ws.length<=wsIndx){
			Ws = in.readLine().split(" ");
			wsIndx=0;
		}
	}
	public static int nextInt()throws Exception{
		check();
		return Integer.parseInt(Ws[wsIndx++]);
	}

	public static long nextLong()throws Exception{
		check();
		return Long.parseLong(Ws[wsIndx++]);
	}

	public static String nextString()throws Exception{
		check();
		return Ws[wsIndx++];
	}

	public static int[] nextInts()throws Exception{
		check();
		int[] tmp = new int[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Integer.parseInt(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static long[] nextLongs()throws Exception{
		check();
		long[] tmp = new long[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Long.parseLong(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static String[] nextStrings()throws Exception{
		check();
		wsIndx=Ws.length;
		return Ws;
	}

}

