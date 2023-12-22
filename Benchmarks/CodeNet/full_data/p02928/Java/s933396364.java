import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {

		int N = nextInt();
		long K = nextInt();
		int[] A = nextInts();
		int[] g = new int[N];
		int[] l = new int[N];
		Arrays.fill(g, 0);
		Arrays.fill(l, 0);
		for(int i=0;i<N;i++){
			for(int k=0;k<N;k++){
				if(A[i]>A[k]){
					g[k]++;
				}
				if(A[i]>A[k]&&i<k){
					l[k]++;
				}
			}
		}

		long ans =0;
		for(int i=0;i<N;i++){
			ans+=(((K-1)*(K))%MOD)*g[i]/2;
			ans%=MOD;
		}
		for(int i=0;i<N;i++){
			ans+=(K*l[i])%MOD;
			ans%=MOD;
		}


		System.out.println(ans);

//		test(new int[]{1,2});
//		test(new int[]{2,1});
	}
	public static void test(int[] A){
		System.out.println(Arrays.toString(A));
		int[] x = new int[10];
		for(int K=1;K<10;K++){
			int N=A.length;
			int[] B = new int[A.length*K];
			for(int i=0;i<N;i++){
				for(int k=0;k<K;k++){
					B[k*N+i]=A[i];
				}
			}

			int cnt=0;
			for(int i=0;i<K*N;i++){
				for(int k=i+1;k<K*N;k++){
					if(B[i]>B[k]){
						cnt++;
					}
				}
			}
			System.out.println("K="+K+" :"+cnt);
			x[K]=cnt;
		}
		x[0]=0;
		for(int i=1;i<x.length;i++){
			System.out.println(x[i]-x[i-1]);
		}
	}

	public static String[] toStringArray(String s) {
		String[] tmp = new String[s.length()];
		char[] c = s.toCharArray();
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = String.valueOf(c[i]);
		}
		return tmp;
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
