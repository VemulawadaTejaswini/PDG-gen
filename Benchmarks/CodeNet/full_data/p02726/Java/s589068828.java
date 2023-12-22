import java.io.*;
import java.util.*;
public class Main {
	static int x;
	static int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int n= inputs.nextInt();
		x = inputs.nextInt();
		y = inputs.nextInt();
		ArrayList<Integer>[] conn = new ArrayList[n+1];
		for(int i=0;i<n+1;i++) {
			conn[i] = new ArrayList<Integer>();
		}
		conn[x].add(y);
		conn[y].add(x);
		conn[1].add(2);
		for(int i=2;i<n;i++) {
			conn[i].add(i-1);
			conn[i].add(i+1);
		}
		conn[n].add(n-1);
		int[] dists = new int[n];
		for(int p=1;p<n+1;p++) {
			int[] dist = new int[n+1];
			for(int i=0;i<n+1;i++) {
				dist[i]=Integer.MAX_VALUE;
			}
			dist[p] = 0;
			ArrayDeque<Integer> nod = new ArrayDeque<Integer>();
			nod.addLast(p);
			while(nod.size()>0) {
				int spot = nod.removeFirst();
				for(int i:conn[spot]) {
					if(dist[i]>dist[spot]+1) {
						dist[i] = dist[spot]+1;
						nod.addLast(i);
					}
				}
			}
			for(int i=1;i<n+1;i++) {
				dists[dist[i]]++;
			}
		}
		for(int i=1;i<n;i++) {
			System.out.println(dists[i]/2);
		}
		/*
		int[] dist = new int[n+1];
		for(int i=1;i<=n-1;i++) {
			for(int j=i+1;j<=n;j++) {
				int far = j-i+range(i,j);
				dist[far]++;
			}
		}
		for(int i=1;i<n;i++) {
			System.out.println(dist[i]);
		}
		*/
	}
	public static int range(int one, int two) {
		if(one<=x&&two>=y) {
			return (x-y)+1;
		}
		return 0;
	}
}
