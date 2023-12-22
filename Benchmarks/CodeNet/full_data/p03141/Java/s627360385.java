import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int N = Integer.parseInt(br.readLine());

			ArrayList<int[]> F = new ArrayList<int[]>();

			for (int i = 0; i < N; i++) {
				int point[] = new int[2];
				String[] input = br.readLine().split(" ", 0);
				point[0] = Integer.parseInt(input[0]);
				point[1] = Integer.parseInt(input[1]);
				F.add(point);
			}

			long P[] = new long[2];

			int tn = 1;

			while (!F.isEmpty()) {
				int mx1 = 0;
				int mx2 = 0;
				int mxi = 0;
				for (int i = 0; i < F.size(); i++) {
					boolean sw = false;
					if (F.get(i)[tn] > mx1) {
						sw = true;
					} else if (F.get(i)[tn] == mx1) {
						if (mx2 < F.get(i)[tn ^ 1]) {
							sw = true;
						}
					}

					if (sw) {
						mx1 = F.get(i)[tn];
						mx2 = F.get(i)[tn ^ 1];
						mxi = i;
					}
				}

				tn ^= 1;

				P[tn] += (long) F.get(mxi)[tn];
				F.remove(mxi);
			}

			System.out.println(P[0] - P[1]);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}
