import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007L;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws Exception {

		int H = nextInt();
		int W = nextInt();

		String[][] S = new String[H+2][W+2];
		Arrays.fill(S[0], ".");
		Arrays.fill(S[S.length-1], ".");
		for(int i=1;i<S.length-1;i++){
			Arrays.fill(S[i], ".");
			String[] tmp = toStringArray(nextString());
			for(int x=0;x<tmp.length;x++){
				S[i][x+1]=tmp[x];
			}
		}

		//4方向の場合は0～5,8方向は0～9でループ
		int[] around = { -1, 0, 1, 0, -1, 1, 1, -1, -1 };
		for(int h=1;h<S.length-1;h++){
			for(int w=1;w<S[h].length-1;w++){
				if(S[h][w].equals(".")){
					int cnt=0;
					for(int x=0;x<around.length-1;x++){
						if(S[h+around[x]][w+around[x+1]].equals("#")){
							cnt++;
						}
					}
					S[h][w]=String.valueOf(cnt);
				}
				System.out.print(S[h][w]);
			}
			System.out.println();
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
