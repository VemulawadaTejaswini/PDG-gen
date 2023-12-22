import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextInt();
		long W = sc.nextInt();

		if (H > W) {
			long tmp = H;
			H = W;
			W = tmp;
		}

		final long S = H * W;
		long min = S;

		long s1, s2, s3;
		// horizontal line
		for (int i = 1; i < H; i++) {
			s1 = i * W;
			long h = H - i;

			// pattern1
			if (h >= 2) {
				s2 = (h / 2) * W;
				s3 = S - s1 - s2;
				min = Math.min(min, Math.max(Math.max(s1, s2), s3) - Math.min(Math.min(s1, s2), s3));
			}
			// pattern 2
			if (W >= 2) {
				s2 = h * (W / 2);
				s3 = S - s1 - s2;
				min = Math.min(min, Math.max(Math.max(s1, s2), s3) - Math.min(Math.min(s1, s2), s3));
			}
		}
		System.out.println(min);

		sc.close();
	}

}
