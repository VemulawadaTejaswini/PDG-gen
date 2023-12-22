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


		for(int i=0;i<N-1;i++){
			C[i]=nextInt();
			S[i]=nextInt();
			F[i]=nextInt();
		}

		for(int i=0;i<N;i++){
			int t=0;
			for(int k=i;k<N-1;k++){
				if(t<S[k]){
					//k駅の始発より前の場合は待つ為tはS[k]となる
					t=S[k];
				}else{
					//待たない場合はk駅の出発時間までの待ちを計算
					if(t%F[k]!=0){
						t+=F[k]-t%F[k];
					}
				}
				t+=C[k];
			}
			pw.println(t);
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

