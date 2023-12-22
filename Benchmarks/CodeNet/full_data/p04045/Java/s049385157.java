import java.io.*;
import java.io.ObjectInputStream.*;
import java.util.*;
import java.util.regex.*;


public class Main {

	final static long MOD = (long)1e9+7;
	//final static long MOD = 998244353;

	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		slove(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void slove(String[] args) throws Exception{

		String n = nextString();
		int K = nextInt();
		int[] d = nextInts();
		boolean[] D = new boolean[10];
		Arrays.fill(D,true);
		for(int i=0;i<K;i++) {
			D[d[i]]=false;
		}
		int minVal = 0;
		for(int i=0;i<10;i++) {
			if(D[i]) {
				minVal=i;
				break;
			}
		}
		int[] ans = new int[n.length()+1];
		for(int i=n.length()-1;i>=0;i--) {
			int x=(n.charAt(i)-'0')+ans[i+1];
			boolean flg=false;
			int k=x;
			for(;k<10;k++) {
				if(D[k]) {
					flg=true;
					break;
				}
			}
			if(k!=x) {
				for(int idx=i+1;idx<ans.length;idx++) {
					ans[idx]=minVal;
				}
				if(flg) {
					ans[i+1]=k;
				}else {
					ans[i+1]=minVal;
					ans[i]=1;
				}
			}else {
				ans[i+1]=k;
			}
		}
		if(ans[0]!=0) {
			for(int k=1;k<10;k++) {
				if(D[k]) {
					ans[0]=k;
					break;
				}
			}

		}
		int v=0;
		for(int i=0;i<ans.length;i++) {
			v=v*10+ans[i];
		}
		pw.println(v);
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

