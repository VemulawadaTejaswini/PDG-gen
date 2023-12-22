
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int xs = sc.nextInt(), ys = sc.nextInt(), xt = sc.nextInt(), yt = sc.nextInt();
		int N = sc.nextInt();
		List<int[]> l = new ArrayList<int[]>();

		for (int i = 0; i < N; i++) {
			int[] res = new int[3];
			res[0] = sc.nextInt();
			res[1] = sc.nextInt();
			res[2] = sc.nextInt();
			l.add(res);
		}
		Collections.sort(l, (a, b) -> a[2] - b[2]);

		List<int[]> tmp = new ArrayList<int[]>();
		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				int[] cir = l.get(i);
				int[] scir = l.get(j);
				if (cir[2] < scir[2] + helper(cir[0], scir[0], cir[1], scir[1])) {
					tmp.add(cir);
				}
			}
		}
		tmp.add(l.get(l.size()-1));

		int[][] cir = new int[3][tmp.size()];
		for (int i = 0; i < tmp.size(); i++) {
			cir[0][i] = tmp.get(i)[0];
			cir[1][i] = tmp.get(i)[1];
			cir[2][i] = tmp.get(i)[2];
		}
		N = tmp.size();
		double[][] floyd = new double[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				floyd[i][j] = helper(cir[0][i], cir[0][j], cir[1][i], cir[1][j]) - cir[2][i] - cir[2][j];
				if (floyd[i][j] < 0)
					floyd[i][j] = 0;
			}
		}
		

		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				for (int k = 0; k < N; k++)
					floyd[i][j] = Math.min(floyd[i][j], floyd[i][k] + floyd[k][j]);


		double res = Integer.MAX_VALUE;
		
		for (int i = 0; i < N; i++){
			for (int j = 0; j < N; j++){
				res = Math.min(res, helper(xs, cir[0][i], ys, cir[1][i]) + floyd[i][j]
						+ helper(cir[0][j], xt, cir[1][j], yt) - cir[2][i] - cir[2][j]);
			}
		}
		if(res<0)
			res=0;
		System.out.println(res);
	}

	private static double helper(int xs, int xt, int ys, int yt) {
		// TODO Auto-generated method stub
		double res = (xt - xs) * (xt - xs) + (yt - ys) * (yt - ys);
		return Math.sqrt(res);
	}
}
