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

		int X=nextInt();
		int Y=nextInt();
		int A=nextInt();
		int B=nextInt();
		int C=nextInt();
		PriorityQueue<Integer> p = new PriorityQueue<>();
		PriorityQueue<Integer> q = new PriorityQueue<>();
		PriorityQueue<Integer> r = new PriorityQueue<>(Comparator.comparing(Integer::intValue,Comparator.reverseOrder()));
		for(int i=0;i<A;i++) {
			p.add(nextInt());
		}

		while(p.size()>X) {
			p.poll();
		}
		for(int i=0;i<B;i++) {
			q.add(nextInt());
		}
		while(q.size()>Y) {
			q.poll();
		}
		for(int i=0;i<C;i++) {
			r.add(nextInt());
		}
		int pMin = p.peek();
		int qMin = q.peek();
		while(!r.isEmpty()) {
			int v = r.poll();
			if(pMin<qMin) {
				if(pMin<v) {
					p.poll();
					p.add(v);
					pMin=p.peek();
				}else {
					break;
				}
			}else {
				if(qMin<v) {
					q.poll();
					q.add(v);
					qMin=q.peek();
				}else {
					break;
				}
			}
		}
		long ans = 0;
		for(int v:p) {
			ans+=v;
		}
		for(int v:q) {
			ans+=v;
		}
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

