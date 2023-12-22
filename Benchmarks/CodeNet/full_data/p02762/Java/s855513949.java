
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List <ArrayList<Node>> friends;
	static int []ans ;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		Unionfind uf = new Unionfind(n);
	
		friends = new ArrayList<ArrayList<Node>>();
		
		for(int i = 0 ;i < n ;i++) {
			friends.add(new ArrayList<Node>());
		}
		
		for(int i = 0 ;i < m ;i++) {
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			friends.get(a).add(new Node(b,false,true));
			friends.get(b).add(new Node(a,false,true));
			uf.union(a, b);
		}
		
		for(int i = 0 ;i < k ;i++) {
			int c = Integer.parseInt(sc.next())-1;
			int d = Integer.parseInt(sc.next())-1;
			friends.get(c).add(new Node(d,false,true));
			friends.get(d).add(new Node(c,false,true));
		}
		ans = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			for(Node e : friends.get(i)) {
				if(e.getLike()||(e.getDislike()&&uf.same(i,e.getTo()))) {
					ans[i]++;
				}
			}
		}
		
		int []size = new int [n];
		for(int i = 0 ;i < n ;i++) {
			size[i] = uf.size(i);
		}
		
		for(int i = 0 ;i < n ;i++) {
			int num = size[i] - ans[i] - 1;
			System.out.println(num);
		}
		}
	
}
class Node{
	private int to;
	private boolean like;
	private boolean dislike;
	
	public Node(int to, boolean like,boolean dislike) {
		this.to = to;
		this.like = like;
		this.dislike = dislike;
	}
	
	public int getTo() {
		return to;
	}
	public boolean getLike() {
		return like;
	}
	public boolean getDislike() {
		return dislike;
	}
}

class Unionfind {

	private int[] data;
	private int[] rootsize;
	private int size;
	
	public Unionfind(int size) {
		this.size = size;
		this.data = new int [size];
		clear();
	}
	
	public void clear() {
		Arrays.fill(data, -1);
	}
	
	public void union(int x , int y ) {
		if((x = root(x)) != (y = root(y))) {
			if(data[y] < data[x]) {
				final int t = x;
				x = y;
				y = t;
			}
			data[x] += data[y];
			data[y] = x;
		}
	}
	
	public int root(int x) {
		if(data[x] < 0) {
			return x;
		}
		else {
			return data[x] = root(data[x]);
		}
	}
	
	public boolean same(int x, int y) {
		return root(x) == root(y);
	}
	
	public int size(int x) {
		int p = root(x);
		int rootsize = 0;
		
		for(int i = 0 ;i < size ;i++) {
			if(root(i) == p) {
				rootsize++;
			}			
		}
		return rootsize ;
	}
}
