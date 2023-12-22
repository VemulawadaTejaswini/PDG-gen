import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {

		int N=nextInt();
		int T=nextInt();
		int A =nextInt();

		int[] H  = nextInts();

		int[] x = new int[N];
		for(int i=0;i<N;i++){
			x[i]=H[i];
		}
		Arrays.sort(x);

		double df=10000;
		int h =x[0];
		for(int i=0;i<N;i++){
			double tmp = T-x[i]*0.006;
			double d = Math.abs(A-tmp);
			if(df < d){
				break;
			}else{
				df=d;
				h=x[i];
			}
		}
		int ans = 0;
		for(ans=0;ans<N;ans++){
			if(H[ans]==h){
				break;
			}
		}


		System.out.println(ans+1);




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
