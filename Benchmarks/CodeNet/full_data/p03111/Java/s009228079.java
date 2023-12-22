import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		final int C = sc.nextInt();

		int[] l = new int[N];
		for (int i = 0; i < N; i++) {
			l[i] = sc.nextInt();
		}

		int minMp = 100000;
		for (int ptn = 1, bound = 1 << (N * 2); ptn < bound; ptn++) {
			int mp = 0;
			int a, b, c;
			a = b = c = 0;
			int ac, bc, cc;
			ac = bc = cc = 0;
			for (int i = 0; i < N; i++) {
				int mask = 3 << i*2;
				int usage = (ptn & mask) >> i*2;
				switch (usage) {
				case 0:
					break;
				case 1:
					a += l[i];
					if (ac++ > 0) {
						mp += 10;
					}
					break;
				case 2:
					b += l[i];
					if (bc++ > 0) {
						mp += 10;
					}
					break;
				case 3:
					c += l[i];
					if (cc++ > 0) {
						mp += 10;
					}
					break;
				}
			}
			if (ac > 0 && bc > 0 && cc > 0) {
				mp += Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C);
				minMp = Math.min(mp, minMp);
			}
		}

		System.out.println(minMp);
		sc.close();
	}

}