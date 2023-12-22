import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int[][] dr = {{0, 0, 1, 1, 1, 2, 2, 2},
			{0, 0, 1, 1, 1, 2, 2, 2},
			{0, 0, 1, 1, 1, 2, 2, 2},
			{-1, -1, -1, 0, 0, 1, 1, 1},
			{-1, -1, -1, 0, 0, 1, 1, 1},
			{-1, -1, -1, 0, 0, 1, 1, 1},
			{-2, -2, -2, -1, -1, -1, 0, 0},
			{-2, -2, -2, -1, -1, -1, 0, 0},
			{-2, -2, -2, -1, -1, -1, 0, 0}};
	static int[][] dc = {{1, 2, 0, 1, 2, 0, 1, 2},
			{-1, 1, -1, 0, 1, -1, 0, 1},
			{-2, -1, -2, -1, 0, -2, -1, 0},
			{0, 1, 2, 1, 2, 0, 1, 2},
			{-1, 0, 1, -1, 1, -1, 0, 1},
			{-2, -1, 0, -2, -1, -2, -1, 0},
			{0, 1, 2, 0, 1, 2, 1, 2},
			{-1, 0, 1, -1, 0, 1, -1, 1},
			{-2, -1, 0, -2, -1, 0, -2, -1}};
	static int H, W, N;
	static Set<String> set;
	static Set<String> set2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		N = sc.nextInt();
		if(N == 0) {
			long t = (long)(H - 2) * (W - 2);
			System.out.println(t);
			for(int i = 0; i < 8; i++) {
				System.out.println(0);
			}
			System.exit(0);
		}
		int[] a = new int[N];
		int[] b = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}
		sc.close();
		set = new HashSet<String>();
		set2 = new HashSet<String>();
		for(int i = 0; i < N; i++) {
			String h = hash(a[i], b[i]);
			set.add(h);
		}
		long[] cnt = new long[10];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 9; j++) {
				if(check(a[i], b[i], j)) {
					cnt[count(a[i], b[i], j)]++;
				}
			}
		}
		cnt[0] = (long)(H - 2) * (W - 2);
		for(int i = 1; i <= 9; i++) {
			cnt[0] -= cnt[i];
		}
		for(long i : cnt) {
			System.out.println(i);
		}
//		System.out.println("");
//		for(String t : set2) {
//			System.out.println(t);
//		}
	}
	static String hash(int k0, int k1) {
		return Integer.toString(k0) + " " + Integer.toString(k1);
	}
	static String hash2(int k0, int k1, int k2) {
		return Integer.toString(k0) + " " + Integer.toString(k1) + " "
				+ Integer.toString(k2);
	}
	static boolean check(int r, int c, int k) {
		if(set2.contains(hash2(r, c, k))) return false;
		for(int i = 0; i < 8; i++) {
			int nr = r + dr[k][i];
			int nc = c + dc[k][i];
			if(nr < 0 || nr >= H || nc < 0 || nc >= W) return false;
		}
		set2.add(hash2(r, c, k));
		for(int i = 0; i < 8; i++) {
			int nr = r + dr[k][i];
			int nc = c + dc[k][i];
			if(set.contains(hash(nr, nc))){
				int k3 = i;
				if(i >= k) k3++;
				if(set2.contains(hash2(nr, nc, k3))) return false;
			}
		}
		for(int i = 0; i < 8; i++) {
			int nr = r + dr[k][i];
			int nc = c + dc[k][i];
			int k3 = i;
			if(i >= k) k3++;
			if(set.contains(hash(nr, nc))){
				set2.add(hash2(nr, nc, k3));
//				if(nr == 0 && nc == 0 && k3 == 1) {
//					//System.out.printf("%d %d %d\n", r, c, k);
//				}
//				if(r == 0 && c == 0) {
//					System.out.printf("%d %d %d\n", nr, nc, k3);
//				}
			}
		}
		return true;
	}
	static int count(int r, int c, int k) {
		int ret = 1;
		for(int i = 0; i < 8; i++) {
			int nr = r + dr[k][i];
			int nc = c + dc[k][i];
			String h = hash(nr, nc);
			if(set.contains(h)) ret++;
		}
		return ret;
	}
}