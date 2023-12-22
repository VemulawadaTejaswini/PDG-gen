import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int N = Integer.parseInt(br.readLine());

			long F[][] = new long[N][];

			for (int i = 0; i < N; i++) {
				long point[] = new long[2];
				String[] input = br.readLine().split(" ", 0);
				point[0] = Integer.parseInt(input[0]);
				point[1] = Integer.parseInt(input[1]);
				F[i] = point;
			}

			long P[] = new long[2];

			int tn = 1;

			for (int r = 0; r < F.length; r++) {
				long mx1 = 0;
				long mx2 = 0;
				int mxi = 0;
				for (int i = 0; i < F.length; i++) {
					boolean sw = false;
					if (F[i] == null) {
					} else if (F[i][tn] > mx1) {
						sw = true;
					} else if (F[i][tn] == mx1) {
						if (mx2 < F[i][tn ^ 1]) {
							sw = true;
						}
					}

					if (sw) {
						mx1 = F[i][tn];
						mx2 = F[i][tn ^ 1];
						mxi = i;
					}
				}

				tn ^= 1;

				P[tn] += F[mxi][tn];
				F[mxi] = null;
			}

			System.out.println(P[0] - P[1]);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}
