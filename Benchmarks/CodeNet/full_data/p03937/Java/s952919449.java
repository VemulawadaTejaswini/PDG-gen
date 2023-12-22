import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007L;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws Exception {


		int H=nextInt();
		int W=nextInt();
		String[][] b = new String[H+2][W+2];
		Arrays.fill(b[0], ".");
		Arrays.fill(b[b.length-1], ".");
		for(int i=0;i<H;i++){
			b[i+1]=toStringArray("."+nextString()+".");
		}
		int x=1;
		int y=1;
		String ans = "Possible";
		//4方向の場合はx[i+around[n]][k+around[n+1]]n<4,8方向はn<8でループ
		int[] around = { -1, 0, 1, 0, -1, 1, 1, -1, -1 };
		while(x!=W||y!=H){
			b[y][x]=".";
//			print(b);
			boolean flg=false;
			for(int i=0;i<4;i++){
				if("#".equals(b[y+around[i+1]][x+around[i]])){
					if(i==0||i==3){
						System.out.println("Impossible");
						return;
					}
					if(flg==false){
						y=y+around[i+1];
						x=x+around[i];
						flg=true;
					}
				}
			}
			if(!flg){
				ans="Impossible";
				break;
			}
		}

		for(int i=0;i<b.length;i++){
			for(int k=0;k<b[i].length;k++){
				if("#".equals(b[i][k])){
					ans="Impossible";
				}
			}
		}

		System.out.println(ans);

	}

	public static void print(String[][] s){
		for(int i=0;i<s.length;i++){
			for(int k=0;k<s[i].length;k++){
				System.out.print(s[i][k]);
			}
			System.out.println();
		}
		System.out.println();
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