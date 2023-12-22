import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *http://code-festval-2017-qualb.contest.atcoder.jp/tasks/code_festival_2017_qualb_c
 */
public class Main {
	
	static class Node{
		public Node(int id) {
			this.id = id;
		}
		int id;
		Set<Integer> n1 = new HashSet<Integer>();
		Set<Integer> n2 = new HashSet<Integer>();
		Set<Integer> n3 = new HashSet<Integer>();
	}


	static Node[] nodes;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		nodes = new Node[N+1];
		for(int i=1; i<=N; i++) nodes[i] = new Node(i);
		for(int i=1; i<=M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			nodes[a].n1.add(b);
			nodes[b].n1.add(a);
		}
		sc.close();
		
		for(int i=1; i<=N; i++){
			for(int j: nodes[i].n1){
				for(int nn: nodes[j].n1){
					if(i!=nn){
						nodes[i].n2.add(nn);
						nodes[nn].n2.add(i);
					}
				}
			}
		}
		
		for(int i=1; i<=N; i++){
			for(int j: nodes[i].n2){
				for(int nn: nodes[j].n1){
					if(!(i==nn) && !nodes[i].n1.contains(nn)){
						nodes[i].n3.add(nn);
						nodes[nn].n3.add(i);
					}
				}
			}
		}
		
		for(int h=1; h<20; h++){
			for(int i=1; i<=N; i++){
				Set<Integer> v = new HashSet<>();
				for(int j: nodes[i].n3){
					for(int nn: nodes[j].n2){
						if(!(i==nn)&& !nodes[i].n1.contains(nn)){
							nodes[nn].n3.add(i);
							v.add(nn);
						}
					}
				}
				nodes[i].n3.addAll(v);
			}
		}
		
		long ans = 0;
		for(int i=1; i<=N; i++){
			ans += nodes[i].n3.size();
		}
		
		System.out.println(ans/2);
	
	}
	
}
