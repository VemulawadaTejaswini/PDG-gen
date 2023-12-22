import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007L;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws Exception {


		String[] a = toStringArray(nextString());
		String[] b = toStringArray(nextString());
		String[] c = toStringArray(nextString());
		int ai=0;
		int bi=0;
		int ci=0;
		String next="a";
		String ans ="";
		while(ai<=a.length&&bi<=b.length&&ci<=c.length){
			if("a".equals(next)){
				if(ai==a.length){
					ans="A";
					break;
				}
				next=a[ai];
				ai++;
			}else if("b".equals(next)){
				if(bi==b.length){
					ans="B";
					break;
				}
				next=b[bi];
				bi++;

			}else{
				if(ci==c.length){
					ans="C";
					break;
				}
				next=c[ci];
				ci++;

			}
		}
		System.out.println(ans);

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

public static long lcm(long a, long b) {
	long x, y;

	return ((a/gcd(a,b))*b);
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