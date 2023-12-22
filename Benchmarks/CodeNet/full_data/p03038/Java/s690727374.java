import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		solution(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solution(String[] args) throws Exception{

		int N = nextInt();
		int M = nextInt();
		int[] A = nextInts();
		TreeMap<Integer,Integer> map = new TreeMap<>();
		long sum = 0;
		//キーの圧縮
		for(int i=0;i<A.length;i++){
			map.put(A[i], map.getOrDefault(A[i], 0)+1);
			sum+=A[i];
		}
		int[][] B = new int[M][2];
		for(int i=0;i<M;i++){
			B[i][0]=nextInt();
			B[i][1]=nextInt();
		}

		//置き換えるものを降順に並べる
		Arrays.sort(B,(s1,s2)->{return s2[1]-s1[1];});

		int min = 0;
		int i=0;
		for(int key:map.keySet()){
			int remain = map.get(key);
			while(i<M){
				if(B[i][1]>key){
					//増えた分の増分を足す
					long sub = Math.min(B[i][0], remain);
					sum+=sub*(B[i][1]-key);
					B[i][0]-=sub;
					remain-=sub;
					if(B[i][0]==0){
						i++;
					}
					if(sub==0){
						break;
					}
				}else{
					i=M;
				}
			}
		}





		pw.println(sum);

	}

	public static void dfs(int n,int cnt,ArrayList<Integer>[] tree,int parent,int[] set){
		if(n!=parent&&tree[n].size()==1){
			set[n]=cnt;
			return;
		}
		for(int x:tree[n]){
			if(x==parent){
				continue;
			}
			dfs(x,cnt+1,tree,n,set);
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

