import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int H = sc.nextInt();
		final int W = sc.nextInt();

		final long S = H * W;
		long min = S;

		long s1, s2, s3;
		// horizontal line
		for (int i = 1; i < H; i++) {
			s1 = i * W;
			long rest = S - s1;
			int h = H - i;
			if (rest % 2 == 0) {
				s2 = s3 = rest / 2;
				min = Math.min(min, Math.abs(s1 - s2));
			} else {
				// pattern 1
				s2 = (h / 2) * W;
				s3 = ((h / 2) + 1) * W;
				min = Math.min(min, Math.max(s1, s3) - Math.min(s1, s2));
				// pattern 2
				s2 = h * (2 / W);
				s3 = h * ((2 / W) + 1);
				min = Math.min(min, Math.max(s1, s3) - Math.min(s1, s2));
			}
		}

		// vertical line
		for (int i = 1; i < W; i++) {
			s1 = H * i;
			long rest = S - s1;
			int w = W - i;
			if (rest % 2 == 0) {
				s2 = s3 = rest / 2;
				min = Math.min(min, Math.abs(s1 - s2));
			} else {
				// pattern 1
				s2 = H * (w / 2);
				s3 = H * (1 + (2 / w));
				min = Math.min(min, Math.max(s1, s3) - Math.min(s1, s2));

				// pattern 2
				s2 = (H / 2) * w;
				s3 = (1 + (H / 2)) * w;
				min = Math.min(min, Math.max(s1, s3) - Math.min(s1, s2));

			}
		}

		System.out.println(min);

		sc.close();
	}

}
