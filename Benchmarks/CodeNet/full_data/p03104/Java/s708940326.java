import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = sc.nextLong();
		long max = sc.nextLong();
		sc.close();
		int binMax = 0;
		while (max > Math.pow(2, binMax)) {
			binMax++;
		}
		int[] array = new int[binMax + 1];
		for (long i = min; i <= max; i++) {
			long nowi = i;
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
		long ans = 0;
		for (int k = 0; k < binMax + 1; k++) {
			if (array[k] % 2 == 1) {
				ans += Math.pow(2, k);
			}
		}
		System.out.println(ans);
	}
}