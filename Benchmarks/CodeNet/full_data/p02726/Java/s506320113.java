
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int n,x,y;
	static List <Integer> [] Edge;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 n = Integer.parseInt(sc.next());
		 x = Integer.parseInt(sc.next());
		 y = Integer.parseInt(sc.next());
		
		Edge = new ArrayList [n];
		
		for(int i = 0 ;i < n ;i++) {
			Edge[i] = new ArrayList<Integer>();
		}
		Edge[x-1].add(y-1);
		Edge[y-1].add(x-1);
		
		for(int i = 0 ;i < n-1 ; i++) {
			Edge[i].add(i+1);
			Edge[i+1].add(i);
		}
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i <= n ;i++) {
			map.put(i, 0);
		}
		
		int ans [][] = new int [n][n];
		
		for(int i = 0 ; i < n ; i++) {
			ans[i] = solve(n , i);
			for(int j = 0 ; j < n ; j++) {
				if(ans[i][j] != 0 && ans[i][j] != n) {
					if(i < j) {
					map.put(ans[i][j],1+map.get(ans[i][j]));
					}
				}
			}
		}
		
		for(int num : map.keySet()) {
			if(num == 0 || num == n) {
				continue;
			}
			System.out.println(map.get(num));
		}
		
	}
	
	static int [] solve(int n,int st) {
		PriorityQueue <Pos> que = new PriorityQueue<Pos>();
		int []d = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			d[i] = n;
		}
		BitSet used = new BitSet(n);
		que.add(new Pos(0,st));
		d[st] = 0;
		

		while(!que.isEmpty()) {
			Pos p = que.poll();		
			int v = p.getTo();
			if(used.get(p.getTo())) {
				continue;
			}
			used.set(p.getTo());
			for(int num: Edge[v]) {
				if(d[num] > d[v] + 1 ) {
					d[num] =  d[v] + 1;
					que.add(new Pos(d[num],num));
				}
			}
		}
		
		return d;
		
		
	}

}


class Pos implements Comparable<Pos>{
	
	private int cost;
	private int to;
	
	public Pos (int cost, int to) {
		this.cost = cost;
		this.to = to;
	}
	
	public int getCost() {
		return cost;
	}

	public int getTo() {
		return to;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setTo(int to) {
		this.to = to;
	}

	@Override
	public int compareTo(Pos o) {
		return Integer.compare(cost, o.cost);
	}
	
}