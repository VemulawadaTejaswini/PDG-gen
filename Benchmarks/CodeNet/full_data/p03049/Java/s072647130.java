import java.io.*;
import java.util.*;
import java.util.regex.*;


public class Main {

	//final static long MOD = 1000000007;
	final static long MOD = 998244353;

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

		int N = nextInt();
		long ans = 0;
		int bx =0;
		int xa =0;
		int ba =0;
		for(int i=0;i<N;i++) {
			String s = nextString();
			if(s.charAt(0)=='B' && s.charAt(s.length()-1)=='A') {
				ba++;
			}else if(s.charAt(0)=='B') {
				bx++;
			}else if(s.charAt(s.length()-1)=='A') {
				xa++;
			}
			ans+=(s.length()-s.replaceAll("AB","").length())/2;
		}
		//xa ba ba・・・ba bxが作れる場合
		boolean flg=false;
		if(xa!=0&&ba!=0) {
			xa--;
			ba--;
			ans++;
			flg=true;
		}
		if(ba!=0) {
			ans+=ba;
			if(!flg) {
				ans--;
			}
			flg=true;
		}
		if(flg) {
			bx--;
			ans++;
		}
		//xa bx xa bx ・・・を作る
		ans+=Math.min(xa,bx);
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

