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
		ArrayList<String> sb = new ArrayList<>();
		int revFlg=-1;
		int Q = nextInt();
		int T=0 ;
		int F=0;
		char[] head = new char[Q];
		char[] tail = new char[Q];
		int hi=0;
		int ti=0;

		Arrays.fill(head, ' ');
		Arrays.fill(tail, ' ');

		char C=' ';
		for(int i=0;i<Q;i++){
			T=nextInt();
			if(T==2){
				F=nextInt();
				C=nextString().charAt(0);
			}
			if(T==1){
				revFlg*=-1;
			}else{
				if(F==1){
					if(revFlg==-1){
						head[hi]=C;
						hi++;
					}else{
						tail[ti]=C;
						ti++;
					}
				}else{
					if(revFlg==-1){
						tail[ti]=C;
						ti++;
					}else{
						head[hi]=C;
						hi++;
					}
				}
			}
			//System.out.println(i);
		}
		StringBuffer b ;
		String ans="";
		if(revFlg==-1){
			b=new StringBuffer();
			b.append(head);
			ans=b.reverse().toString().trim();

			b=new StringBuffer();
			b.append(S);
			ans+=b.reverse().toString().trim();

			b=new StringBuffer();
			b.append(tail);
			ans+=b.toString().trim();

		}else{
			b=new StringBuffer();
			b.append(tail);
			ans=b.reverse().toString().trim();

			b=new StringBuffer();
			b.append(S);
			ans+=b.reverse().toString().trim();

			b=new StringBuffer();
			b.append(head);
			ans+=b.toString().trim();
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
