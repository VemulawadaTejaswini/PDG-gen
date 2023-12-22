import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007L;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static ArrayList<int[]> list = new ArrayList<>();
	public static long[] ans = new long[]{-1,-1,-1};
	public static void main(String[] args) throws Exception {


		long K = nextLong();
		long A = nextLong();
		long B = nextLong();

		long bis = 1;


		if(A>bis){
			if(K-(A-bis)>0){
				K-=A-bis;
				bis+=A-bis;
			}else{
				bis+=K;
				K=0;
			}
		}
		//円に交換しないほうが効率がいい場合
		if(B-A-2<=0){
			bis+=K;
			K=0;
		}else{
			//円に交換したほうがいい場合はコスト2を払ってビスケットが1枚以上増える
			bis+=(B-A)*(K/2);
			//最後にビスケットに交換できない場合は残りの手数（１）回分を増やす
			if(K%2==1){
				bis++;
			}
		}

		System.out.println(bis);
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
