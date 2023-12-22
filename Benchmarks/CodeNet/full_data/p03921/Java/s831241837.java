import java.util.*;
public class Main{
	public static class Node{
		ArrayList<Integer> to;
		int p_or_l;
		Node(){
			to = new ArrayList<Integer>();
		}
	}

	static Scanner sn = new Scanner(System.in);
	static int N = sn.nextInt();
	static int M = sn.nextInt();
	static Node[] peple = new Node[100002];
	static Node[] lang = new Node[100002];
	static boolean[] visit = new boolean[100002];
	public static void main(String[] args){		
		for(int i = 0; i < N; ++i){
			peple[i] = new Node();
			peple[i].p_or_l = 0;
			visit[i] = false;
		}
		for(int i = 0;i < M; ++i){
			lang[i] = new Node();
			lang[i].p_or_l = 1;		
		}
		for(int i = 0; i < N; ++i){
			int K = sn.nextInt();
			for(int j = 0; j < K; ++j){
				int l = sn.nextInt();
				peple[i].to.add(l-1);
				lang[l-1].to.add(i);
			}
		}
		visit[0] = true;
		solve(peple[0]);
		check();
	}

	public static void solve(Node p){
		if(p.to.isEmpty()) return;
		for(int i = 0; i < p.to.size(); ++i){		
			int next = p.to.get(i);			
			if(p.p_or_l == 0){				
				solve(lang[next]);
			}
			else{
				if(visit[next]) continue;
				visit[next] = true;
				solve(peple[next]);
			}
		}
	}
	public static void check(){
		boolean flag = true;
		for(int i = 0; i < N; ++i){
			if(!visit[i]){
				flag = false;
				break;
			}  
		}
		if(flag) System.out.println("YES");
		else System.out.println("NO");
	}
}
