import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static void main(String[] args) throws Exception {
		solution(args);
		if(in!=null){
			in.close();
		}
	}

	public static void solution(String[] args) throws Exception{

		int N = nextInt();
		Node[] p = new Node[N+1];
		for(int i=0;i<=N;i++){
			p[i] = new Node(i);
		}
		Node[] e = new Node[N+1];
		for(int i=1;i<N;i++){
			int a=nextInt();
			int b=nextInt();
			p[a].addChild(p[b]);
			e[i]=p[b];
		}
		p[1].setColor();
		int colors = p[1].getElem(0);
		System.out.println(colors);
		for(int i=1;i<N;i++){
			System.out.println(e[i].color);
		}
	}


	static class Node {
		public static ArrayDeque<Node> queue = new ArrayDeque<>();
		public int p;
		public int color;
		public ArrayList<Node> child=new ArrayList<>();
		public Node(int p){
			this.p=p;


		}
		public void addChild(Node x){
			child.add(x);
		}

		public void setColor(){


			for(Node node:child){
				queue.add(node);
			}

			int colorIdx = 1;
			//親から子への辺に色付けを行う
			for(Node node:child){
				if(colorIdx==color){
					colorIdx++;
				}
				node.color=colorIdx;
				colorIdx++;
			}
			Node ch = queue.poll();
			if(ch!=null){
				ch.setColor();
			}
		}

		public int getElem(int p){
			int cnt = child.size()+p;
			for(Node node:child){
				cnt=Math.max(cnt, node.getElem(1));
			}
			return cnt;
		}


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
