import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {

		int N = nextInt();
		int M = nextInt();
		Pair[] p = new Pair[M];
		ArrayList<Pair> list = new ArrayList<>();
		for(int i =0;i<M;i++){

			p[i]=new Pair(nextInt(),nextInt(),i);
			list.add(p[i]);
		}
		Collections.sort(list,Pair.getComparator());

		int cnt=0;
		int bef=-1;
		for(Pair x:list){
			if(bef!=x.N){
				cnt=0;
				bef=x.N;
			}
			cnt++;
			x.cnt=cnt;
		}
		PrintWriter pw = new PrintWriter(System.out);
		for(Pair x:p){
			pw.printf("%06d%06d\n",x.N,x.cnt);
		}
		pw.flush();
	}

	public static class Pair {
		int N;
		int V;
		int idx;
		int cnt;

		Pair(int N, int V,int idx) {
			this.N = N;
			this.V = V;
			this.idx=idx;
		}

		public int getN() {
			return N;
		}

		public int getV() {
			return V;
		}


		public int getIdx() {
			return idx;
		}

		public void setIdx(int idx) {
			this.idx = idx;
		}

		public static Comparator<Pair> getComparator() {
			return Comparator.comparing(Pair::getN).thenComparing(Pair::getV);
		}
		public static Comparator<Pair> getComparator2() {
			return Comparator.comparing(Pair::getIdx);
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
