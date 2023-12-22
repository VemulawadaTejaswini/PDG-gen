import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {

		int A = nextInt();
		int B = nextInt();
		int M = nextInt();
		int[] a = nextInts();
		int[] b = nextInts();
		int[][] x = new int[M][];
		for(int i=0;i<M;i++){
			x[i]=nextInts();
		}


		long ansA = Long.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			ansA=Math.min(ansA, a[i]);
		}
		long ansB = Long.MAX_VALUE;
		for(int i=0;i<b.length;i++){
			ansB=Math.min(ansB, b[i]);
		}
		long ans = ansA+ansB;


		for(int i=0;i<x.length;i++){
			ans = Math.min(ans, a[x[i][0]-1]+b[x[i][1]-1]-x[i][2]);
		}

		System.out.println(ans);
	}

	public static boolean isExpN(long a,int base){
		int x=1;
		while((int)Math.pow(x, 2) <= a){
			if((int)Math.pow(x, 2) == a){
				return true;
			}
			x*=base;
		}
		return false;
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
