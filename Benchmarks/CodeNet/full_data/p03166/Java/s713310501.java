import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();

		ArrayList<Integer>[] chld = new ArrayList[n + 1];
		for ( int i = 0; i <= n; i++ ) {
			chld[i] = new ArrayList<Integer>();
		}

		HashSet<Integer> q = new HashSet<Integer>();
		for ( int i = 0; i < m; i++ ) {
			int x = in.nextInt(), y = in.nextInt();
			chld[x].add(y);
			q.add(x);
		}
		in.close();

		int ans = 0;
		for ( int len = 0; len <= m; len++ ) {

			HashSet<Integer> newq = new HashSet<Integer>();
			for ( Integer i : q ) {
				System.out.print(i);
				newq.addAll(chld[i]);
			}
			System.out.println();
			q = newq;

			if ( q.size() == 0 ) {
				ans = len;
				break;
			}
		}
		System.out.println(ans);		
	}
}
