import java.io.*;
import java.util.*;
import java.util.regex.*;


public class Main {

	final static long MOD = 1000000007;
	//final static long MOD = 998244353;

	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		solutionA(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solutionA(String[] args) throws Exception{

		int N=nextInt();
		int[] A = nextInts();
		int[] check = new int[N];
		for(int i=0;i<N;i++) {
			check[A[i]]++;
		}
		if(N%2==1) {
			if(check[0]!=1) {
				pw.println(0);
				return;
			}
			for(int i=2;i<check.length;i+=2) {
				if(check[i]!=2) {
					pw.println(0);
					return;
				}
			}
		}else {
			for(int i=1;i<check.length;i+=2) {
				if(check[i]!=2) {
					pw.println(0);
					return;
				}
			}

		}

		long ans ;
		if(N%2==0) {
			ans=2;
			N-=2;
		}else {
			ans=1;
			N-=1;
		}
		for(int i=0;i<N/2;i++) {
			ans*=2;
			ans%=MOD;
		}
		pw.println(ans);


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

