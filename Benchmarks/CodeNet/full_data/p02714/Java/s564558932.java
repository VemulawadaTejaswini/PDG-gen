import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static String[] s;
	public static void main(String[] args) throws Exception {

		int N = nextInt();
		String S = nextString();
		s = new String[S.length()];

		ArrayList<Integer> R = new ArrayList<>();
		ArrayList<Integer> G = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();

		for(int i=0;i<s.length;i++){
			s[i]=S.substring(i,i+1);
			if("R".equals(s[i])){
				R.add(i);
			}
			if("G".equals(s[i])){
				G.add(i);
			}
			if("B".equals(s[i])){
				B.add(i);
			}
		}

		long ans =0;
//		for(int r:R){
//			for(int g:G){
//				for(int b:B){
//					int i=Math.min(Math.min(r, g),b);
//					int k=Math.max(Math.max(r, g),b);
//					int j = r+g+b-i-k;
//					if(j-i!=k-j){
//						ans++;
////						System.out.println(s[i]+":"+s[j]+":"+s[k]);
//					}
//
//				}
//			}
//		}
//		System.out.println(ans);
		ans=R.size()*G.size()*B.size();
		BigInteger x = BigInteger.valueOf(R.size()).multiply(BigInteger.valueOf(G.size())).multiply(BigInteger.valueOf(B.size()));
		BigInteger s1 = BigInteger.valueOf(1);
		for(int i=1;i<N;i++){
			for(int k=i;k+i<N;k++){
				if(!s[k-i].equals(s[k]) && !s[k-i].equals(s[k+i]) &&!s[k].equals(s[k+i])){
					x = x.subtract(s1);
				}
			}
		}
//
//		ans+=rgb(R,G,B);
//		ans+=rgb(R,B,G);
//		ans+=rgb(G,R,B);
//		ans+=rgb(G,B,R);
//		ans+=rgb(B,G,R);
//		ans+=rgb(B,R,G);
//
//



		System.out.println(x.longValue());

	}


	public static long rgb(TreeSet<Integer>R,TreeSet<Integer>G,TreeSet<Integer>B){

		long ans =0;
		for(int i:R){
			for(int j:G.tailSet(i)){
				Set<Integer> t = B.tailSet(j+j-i-1);
				ans+=t.size();
			}
		}
		return ans;
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
