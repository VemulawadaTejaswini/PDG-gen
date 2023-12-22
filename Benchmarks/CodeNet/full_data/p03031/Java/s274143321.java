import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007L;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws Exception {

		int N=nextInt();
		int M=nextInt();
		int[][] s = new int[M][];
		for(int i=0;i<M;i++){
			s[i]=new int[nextInt()];
			for(int k=0;k<s[i].length;k++){
				s[i][k]=nextInt();
			}
		}
		int[] p = nextInts();
		int ans=0;
		int last = (int)Math.pow(2, N);
		for(int i=0;i<last;i++){
			boolean[] b = new boolean[N];
			int idx=0;
			for(int k=1;k<last;k=k<<1){
				b[idx]=((i&k)==k);
				idx++;
			}
			boolean flg=true;
			for(int k=0;k<M;k++){
				int num=0;
				for(int z=0;z<s[k].length;z++){
					if(b[s[k][z]-1]){
						num++;
					}
				}
				if(num%2!=p[k]){
					flg=false;
					break;
				}
			}
			if(flg){
				ans++;
			}
		}

		System.out.println(ans);
	}


	public static long[] disassemblyAlph(String s) {
		long[] alph = new long['z' - 'a' + 1];
		Arrays.fill(alph, 0);
		for (int i = 0; i < s.length(); i++) {
			alph[s.charAt(i) - 'a']++;
		}
		return alph;
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