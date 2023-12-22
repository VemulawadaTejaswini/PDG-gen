import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private BufferedReader br;
	private int n, w;
	private int[][] choice;

	private StringTokenizer st;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Main().start();
	}

	private void start() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()) + 1;
		w = Integer.parseInt(st.nextToken()) + 1;
		Item ite[] = new Item[n];

		choice = new int[n][w];
		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			ite[i] = new Item(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < w; j++) {
				if (ite[i].wei > j) {
					choice[i][j] = choice[i - 1][j];
				} else {
					choice[i][j] = Math.max(ite[i].val + choice[i - 1][j - ite[i].wei], choice[i - 1][j]);
				}
			}
		}
		System.out.println(choice[n-1][w-1]);
	}

	public class Item {
		int wei;
		int val;

		public Item(int a, int b) {
			this.wei = a;
			this.val = b;
		}
	}
}
