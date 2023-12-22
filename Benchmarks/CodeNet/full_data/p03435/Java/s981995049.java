
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] b = new int[3][3];

		for (int x = 0; x < 3; x++) {
			String[] foo = br.readLine().split(" ");
			for (int y = 0; y < 3; y++) {
				b[x][y] = Integer.parseInt(foo[y]);
			}
		}

		int a2 = 0;
		int a3 = 0;
		int b1 = 0;
		int b2 = 0;
		int b3 = 0;

		for (int a1 = 0; a1 < 100; a1++) {
			b1 = b[0][0] - a1;
			b2 = b[0][1] - a1;
			b3 = b[0][2] - a1;

			int[] bls = { b1, b2, b3 };

			for (int x = 0; x < 3; x++) {
				if (x == 0) {
					a2 = b[1][x] - bls[x];
					a3 = b[2][x] - bls[x];
				} else {
					if (a2 != b[1][x] - bls[x]) {
						System.out.println("No");
						System.exit(0);
					}
					if (a3 != b[2][x] - bls[x]) {
						System.out.println("No");
						System.exit(0);
					}
					a2 = b[1][x] - bls[x];
					a3 = b[2][x] - bls[x];

				}
			}

		}
		System.out.println("Yes");

	}
}
