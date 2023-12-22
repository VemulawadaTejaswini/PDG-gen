import java.io.*;
import java.io.ObjectInputStream.*;
import java.util.*;
import java.util.regex.*;


public class Main {

	final static long MOD = 1000000007;
	//final static long MOD = 998244353;

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

		int H = nextInt();
		int W = nextInt();
		char[][] s = new char[H+2][W+2];
		Arrays.fill(s[0],'@');
		Arrays.fill(s[H+1],'@');
		for(int i=1;i<=H;i++) {
			s[i]=("@"+nextString()+"@").toCharArray();
		}

		pw.println(dfs(1,1,H,W,s,s[1][1]=='.'?0:1));
	}

	public static int dfs(int x,int y,int gx ,int gy,char[][] s,int sum) {
		if(x==gx&&y==gy) {
			return sum;
		}
		if(s[y][x]=='@') {
			return Integer.MAX_VALUE;
		}

		int r ;
		if(s[y][x+1]=='.'||s[y][x+1]==s[y][x]) {
			r=dfs(x+1,y,gx,gy,s,sum);
		}else {
			r=dfs(x+1,y,gx,gy,s,sum+1);
		}

		int d ;
		if(s[y+1][x]=='.'||s[y+1][x]==s[y][x]) {
			d=dfs(x,y+1,gx,gy,s,sum);
		}else {
			d=dfs(x,y+1,gx,gy,s,sum+1);
		}
		return Math.min(r,d);


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

