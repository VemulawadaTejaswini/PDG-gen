import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {

		int A = nextInt();
		int B = nextInt();
		int C = nextInt();

		int ans = 0;
		if(A==B&&B==C&A%2==0){
			System.out.println(-1);
			return;
		}
		while(A%2==0 && B%2==0 && C%2==0){
			int tmpA = B/2+C/2;
			int tmpB = A/2+C/2;
			C=A/2+B/2;
			A=tmpA;
			B=tmpB;
			ans++;
		}

		System.out.println(ans);

	}

	public static boolean is2n(long a){
		int x=1;
		while((int)Math.pow(x, 2) <= a){
			if((int)Math.pow(x, 2) == a){
				return true;
			}
			x*=2;
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
