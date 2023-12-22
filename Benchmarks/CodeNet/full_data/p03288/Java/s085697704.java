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
			int subTot = 0;
			int ansNum = 0;
			int rest_max = -1;

			for (int i = 0; i < dim; i++) {
				if ((1 & bit >> i) == 1) {
					subTot += 100 * (i + 1) * points[i] + compBonus[i];
					ansNum += points[i];
				} else {
					rest_max = i;
				}
			}

			// 全完だけでは足りないときに、一番大きい配点で部分点獲得
			if (subTot < goal) {
				int s1 = 100 * (rest_max + 1);
				int need = (goal - subTot + s1 - 1) / s1;
				if (need >= points[rest_max]) {
					continue;
				}
				ansNum += need;
			}
			ans = Math.min(ans, ansNum);
		}
		System.out.println(ans);
	}
}
