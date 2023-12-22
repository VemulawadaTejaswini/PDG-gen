import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static class Info {
		int l;
		int r;
		int d;

		private Info(int l, int r, int d) {
			this.l = l;
			this.r = r;
			this.d = d;
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		int inM = stdin.nextInt();

		List<Info> list = new ArrayList<>();
		for (int i = 0; i < inM; i++) {
			int inL = stdin.nextInt() - 1;
			int inR = stdin.nextInt() - 1;
			int inD = stdin.nextInt();
			list.add(new Info(inL, inR, inD));
		}
		Collections.sort(list, (info1, info2) -> {
			if (info1.l != info2.l) {
				return Integer.compare(info1.l, info2.l);
			}
			else if (info1.r != info2.r) {
				return Integer.compare(info1.r, info2.r);
			}

			return Integer.compare(info1.d, info2.d);
		});

		int[] x = new int[inN];
		Arrays.fill(x, -1);
		for (Info info : list) {
			if (x[info.l] < 0) {
				x[info.l] = 0;
			}

			int r = x[info.l] + info.d;
			if (x[info.r] < 0) {
				x[info.r] = r;
			}
			else if (x[info.r] != r) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}

}
