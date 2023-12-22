
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int N,K,L;
	ArrayList<Integer> []rail=new ArrayList[200001];
	ArrayList<Integer> []road=new ArrayList[200001];
	boolean[] visited=new boolean[200001];
	int id=1;
	long []ar=new long[200001];
	long []br=new long[200001];
	long MAX_N=200001;
	
	HashMap<Long,Long> dp=new HashMap<>();
	
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		L=sc.nextInt();
		for(int i=0;i<20001;i++)rail[i]=new ArrayList<Integer>();
		for(int i=0;i<20001;i++)road[i]=new ArrayList<Integer>();
		
		for(int i=0;i<K;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			road[a].add(b);
			road[b].add(a);
			
		}
		for(int i=1;i<=N;i++){
			if(!visited[i]){
				dfs(i);
			}
			++id;
		}
		
		for(int i=0;i<L;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			rail[a].add(b);
			rail[b].add(a);
		}
		Arrays.fill(visited,false);
		id=1;
		
		for(int i=1;i<=N;i++){
			if(!visited[i]){
				dfs2(i);
			}
			++id;
		}
		
		for(int i=1;i<=N;i++){
			if(dp.containsKey(ar[i]*MAX_N+br[i])){
				dp.put(ar[i]*MAX_N+br[i], dp.get(ar[i]*MAX_N+br[i])+1);
			}else{
				dp.put(ar[i]*MAX_N+br[i],(long) 1);
			}
		}
		
		for(int i=1;i<=N;i++){
			System.out.println(dp.get(ar[i]*MAX_N+br[i]));
		}
		
	}
	void dfs(int v){
		visited[v]=true;
		ar[v]=id;
		for(int to :road[v]){
			if(!visited[to]){
				dfs(to);
			}
		}
	}
	void dfs2(int v){
		visited[v]=true;
		br[v]=id;
		
		for(int to :rail[v]){
			if(!visited[to]){
				dfs2(to);
			}
		}
	}
}