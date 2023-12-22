import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int N = Integer.parseInt(line);
		int[] x = new int[N];
		int[] y = new int[N];
		//ArrayList list = new ArrayList();
		for (int i = 0; i < N; i++) {
			line = reader.readLine();
			String[] str = line.split(" ");
			x[i] = Integer.parseInt(str[0]);
			y[i] = Integer.parseInt(str[1]);
			//list.add(new Main(Integer.parseInt(str[0]), Integer.parseInt(str[1])));
		}
		//Comparator.comparing(...).thenComparing(...);

		ArrayList<Integer> x_sa = new ArrayList<>();
		ArrayList<Integer> y_sa = new ArrayList<>();
		for (int i = 0; i < N-1; i++) {
			x_sa.add(x[i+1] - x[i]);
			y_sa.add(y[i+1] - y[i]);
		}
		Collections.sort(x_sa);
		Collections.sort(y_sa);
		ArrayList<Integer> x_dif = new ArrayList<>(new HashSet<>(x_sa));
		ArrayList<Integer> y_dif = new ArrayList<>(new HashSet<>(y_sa));
		
		int ans = Integer.MAX_VALUE;
		for (int dy = 0; dy < y_dif.size(); dy++) {
			for (int dx = 0; dx < x_dif.size(); dx++) {
				int ans_keep = 1;
				for (int i = 0; i < N-1; i++) {
					if (x[i] + x_dif.get(dx) == x[i+1] && y[i] + y_dif.get(dy) == y[i+1]) {
						ans_keep += 0;
					}
					else {
						ans_keep ++;
					}
				}
				if (ans_keep < ans) {
					ans = ans_keep;
				}
			}
		}

		System.out.println(ans);
	}

	//	private int x;
	//	private int y;
	//	public Main(int x, int y) {
	//		this.x = x;
	//		this.y = y;
	//	}
	//
	//	public int getX() {
	//		return x;
	//	}
	//
	//	public void setX(int x) {
	//		this.x = x;
	//	}
	//
	//	public int getY() {
	//		return y;
	//	}
	//
	//	public void setY(int y) {
	//		this.y = y;
	//	}
}
