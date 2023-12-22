import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力1をnに入れる
		int dim = sc.nextInt();
		int goal = sc.nextInt();

		int[] points = new int[dim];
		int[] compBonus = new int[dim];

		for (int i=0;i<dim;i++) {
			points[i] = sc.nextInt();
			compBonus[i] =sc.nextInt();
		}

		int ans = 1 << 10;

		//ビット全探索でdimごとに全完する
		for (int bit = 0; bit < 1 << dim; bit++) {
			int sum = 0;
			int num = 0;

			for (int i = 0; i < dim; i++) {
				if ((1 & bit >> i) == 1) {
					sum += 100 * (i + 1) * points[i] + compBonus[i];
					num += points[i];
				}
			}
			if (sum >= goal) {
				ans = Math.min(ans, num);
			} else {
				for (int i = dim - 1; i >= 0; i--) {
					if ((bit & (1 << i)) == 1) 	continue;
					for (int j = 0; j < points[i]; j++) {
						if (sum >= goal) break;
						sum += 100* (i+1);
						++num;
					}
				}
				ans = Math.min(ans, num);
			}
		}
		System.out.println(ans);
	}
}