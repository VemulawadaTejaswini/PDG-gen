import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);

		PriorityQueue<Integer> a = new PriorityQueue<>();
		int[][] bc = new int[m][2];

		inputs = br.readLine().split(" ");
		for ( int i = 0; i < n; i++ ) {
			a.add(Integer.parseInt(inputs[i]));
		}

		for ( int i = 0; i < m; i++ ) {
			inputs = br.readLine().split(" ");
			bc[i][0] = Integer.parseInt(inputs[0]);
			bc[i][1] = Integer.parseInt(inputs[1]);
		}
		br.close();

		Arrays.sort(bc, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[1] - o1[1];
			}
		});

		for ( int i = 0; i < m; i++ ) {
			while ( !a.isEmpty() && a.peek() < bc[i][1] && 0 < bc[i][0] ) {
				a.poll();
				a.add(bc[i][1]);
				bc[i][0]--;
			}
		}
		
		long ans = 0L;
		for ( Integer i : a ) {
			ans += i;
		}
		System.out.println(ans);
	}
}