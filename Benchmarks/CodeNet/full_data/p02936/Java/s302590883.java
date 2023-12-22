import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static long[] cnt = null;
	static HashMap<Integer, HashSet<Integer>> map;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();

		map = new HashMap<>();
		for ( int i = 1; i <= n; i++ ) {
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(i);
			map.put(i, set);
		}

		for ( int i = 1; i < n; i++ ) {
			int a = in.nextInt();
			int b = in.nextInt();

			HashSet<Integer> temp = map.get(a);
			temp.add(b);
			map.put(a, temp);
		}

		System.out.println(map);

		cnt = new long[n + 1];
		//		int[] p = new int[q + 1];
		//		int[] x = new int[q + 1];
		for ( int i = 1; i <= q; i++ ) {
			int p = in.nextInt();
			int x = in.nextInt();

			System.out.println("p is " + p);
			HashSet<Integer> temp = map.get(p);
			for ( Integer c : temp ) {
				System.out.println("c is " + c);
				cnt[c] += x;
				
				HashSet<Integer> set = map.get(c);
				calc(set, x);
			}
		}

		for ( int i = 1; i <= n; i++ ) {
			System.out.println(cnt[i] + " ");
		}

		//System.out.println(map);
		in.close();
	}
	
	private static void calc(HashSet<Integer> set, int x) {
		if(set.size() == 1) {
			return;
		}
		for ( Integer c :set) {
			cnt[c] += x;
			
			HashSet<Integer> temp = map.get(c);
			calc(temp, x);
		}		
	}
}