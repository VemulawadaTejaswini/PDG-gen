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
		int u = nextInt()-1;
		int v = nextInt()-1;

		ArrayList<Integer>[] tree = new ArrayList[N];
		for(int i=0;i<N;i++){
			tree[i]=new ArrayList<>();
		}

		for(int i=0;i<N-1;i++){
			int a=nextInt();
			int b=nextInt();
			tree[a-1].add(b-1);
			tree[b-1].add(a-1);

		}
		if(u==v){
			System.out.println(0);
			return;
		}
		int[] uSet = new int[N];

		int[] vSet = new int[N];

		dfs(v,0,tree,v,v,vSet);
		dfs(u,0,tree,u,v,uSet);

		int ans = 0;
		for(int i=0;i<N;i++){
			if(vSet[i]>uSet[i]){
				ans=Math.max(ans, vSet[i]-1);
			}
		}

			System.out.println(ans);
	}

	public static void dfs(int n,int cnt,ArrayList<Integer>[] tree,int parent,int deadEnd,int[] set){
		if(n!=parent&&tree[n].size()==1){
			set[n]=cnt;
			return;
		}
		for(int x:tree[n]){
			if(x==parent||x==deadEnd){
				continue;
			}
			dfs(x,cnt+1,tree,n,deadEnd,set);
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

