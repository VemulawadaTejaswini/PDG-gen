import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		sc.close();
		int binMax = 0;
		while (max > Math.pow(2, binMax)) {
			binMax++;
		}
		int[] array = new int[binMax + 1];
		for (int i = min; i <= max; i++) {
			int nowi = i;
			int bin = 0;
			while (i >= Math.pow(2, bin)) {
				bin++;
			}
			for (int j = 0; j < bin; j++) {
				if (nowi >= Math.pow(2, bin - j -1)) {
					array[bin - j -1]++;
					nowi -= Math.pow(2, bin - j -1);
				}
			}

		}
		int ans = 0;
		for (int k = 0; k < binMax; k++) {
			if (array[k] % 2 == 1) {
				ans += Math.pow(2, k);
			}
		}
		System.out.println(ans);
	}
}