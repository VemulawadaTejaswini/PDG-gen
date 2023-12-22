import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007L;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws Exception {

		String S = nextString();
		int K=nextInt();
		char[] X = (S).toCharArray();
		long[] n = new long[S.length()];
		Arrays.fill(n, 0);
		int idx=0;
		long repC=1;
		boolean flg=false;
		if(X[0]==X[1]){
			flg=true;
		}
		for(int i=1;i<X.length;i++){
			if(X[i]==X[i-1]){
				repC++;
				flg=true;
			}else{
				if(flg){
					n[idx]=repC;
					idx++;
					repC=1;
				}
				flg=false;
			}
		}
		if(flg){
			n[idx]=repC;
		}
		long a=n[0];
		long b=0;
		long c=0;
		for(int i=1;i<n.length;i++){
			c+=n[i];
			if(n[i]==0){
				break;
			}
			b=n[i];
		}
		c=c-b;
		long ans;
		if(a==S.length()){
			ans=a/2*K;
		}else{
			if(X[0]==X[X.length-1]){
				ans = a/2+b/2+(c)*K +((a+b)/2)*(K-1);
			}else{
				ans = (a/2+b/2+c)*K;
			}
		}
		System.out.println(ans);
	}


	public static String[] toStringArray(String s) {
		String[] tmp = new String[s.length()];
		char[] c = s.toCharArray();
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = String.valueOf(c[i]);
		}
		return tmp;
	}

	public static String concatStringArray(String[] s){
		StringBuffer sb = new StringBuffer();
		for(String x:s){
			sb.append(x);
		}
		return sb.toString();
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