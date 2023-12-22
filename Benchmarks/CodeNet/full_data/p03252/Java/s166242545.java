import java.io.*;
import java.util.*;
import java.util.regex.*;

import javax.lang.model.element.*;

public class Main {

	final static long MOD = 1000000007;
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

		String S =nextString();
		String T =nextString();

		char[] ex = new char['z'-'a'+1];
		Arrays.fill(ex, '0');
		int[][] p1 = new int['z'-'a'+1]['z'-'a'+1];
		int[][] p2 = new int['z'-'a'+1]['z'-'a'+1];

		for(int i=0;i<T.length();i++){
			p1[S.charAt(i)-'a'][T.charAt(i)-'a']++;
			p2[T.charAt(i)-'a'][S.charAt(i)-'a']++;
		}
		for(int i=0;i<p1.length;i++){
			ArrayList<Integer> Scnt=new ArrayList<>();
			ArrayList<Integer> Tcnt=new ArrayList<>();

			for(int k=0;k<p1.length;k++){
				if(p1[i][k]!=0){
					Scnt.add(k);
				}
				if(p2[i][k]!=0){
					Tcnt.add(k);
				}
			}
			if(Scnt.size()>1||Tcnt.size()>1){
				pw.println("No");
				return;
			}

		}
		pw.println("Yes");
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

