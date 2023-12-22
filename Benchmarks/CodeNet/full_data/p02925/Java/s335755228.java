import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		
		LinkedList<Integer>[] a = new LinkedList[n + 1];
		for ( int r = 1; r <= n; r++ ) {
			a[r] = new LinkedList<Integer>();
			inputs = br.readLine().split(" ");
			for ( int c = 0; c < n - 1; c++ ) {
				a[r].add(Integer.parseInt(inputs[c]));
			}
		}

		int days = 0;
		boolean stalemate;
		do {
			stalemate = true; // 手詰まり
			days++;
			HashSet<Integer> set = new HashSet<>();
			// p:player
			for ( int p = 1; p <= n; p++ ) {
				try {
					Integer temp1 = a[p].getFirst();
					Integer temp2 = a[temp1].getFirst();

					if ( p == temp2 ) {
						// System.out.println(days + "day, p r is" + p + "_" + temp1 + " done");
						set.add(p);
						set.add(temp1);
						stalemate = false;
					}

				} catch (Exception e) {
					continue;
				}
			}
			for ( Integer i : set ) {
				a[i].removeFirst();
			}

		} while ( !stalemate );

		for ( int i = 1; i <= n; i++ ) {
			if ( a[i].size() != 0 ) {
				System.out.println("-1");
				br.close();
				return;
			}
		}
		System.out.println(days - 1);
		br.close();
	}
}
