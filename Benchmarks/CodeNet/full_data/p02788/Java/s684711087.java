package abc153;

import java.util.*;

public class Main {
	static class Monster {
		int X,H;

		public Monster(int x, int h) {
			X = x;
			H = h;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int D = sc.nextInt();
		int A = sc.nextInt();
		Monster[] monster = new Monster[N];
		for(int i=0; i<N; i++) {
			monster[i] = new Monster(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(monster, new Comparator<Monster>() {
			public int compare(Monster m1, Monster m2) {
				return Integer.compare(m1.X, m2.X); 
			}
		});

		int[] XX = new int[N];
		for(int i=0; i<N; i++)
			XX[i] = monster[i].X;
		
		int[] right = new int[N];
		for(int i=0; i<N; i++) {
			int to = monster[i].X + D*2;
			int idx = Arrays.binarySearch(XX, to);
			if(idx<0)
				idx = -idx-2;
			right[i] = idx+1;
		}

		long[] diff = new long[N+1];
		long ans = 0;
		long damage = 0;
		for(int i=0; i<N; i++) {
			damage += diff[i];
			if(monster[i].H-damage > 0) {
				long bomb = (monster[i].H-damage +A-1)/A;
				ans += bomb;
				damage += bomb*A;
				diff[right[i]] -= bomb*A;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
	
}
