import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		long result = sameBai((long) a, (long) b);
		System.out.println(result);
	}

	static long sameBai(long sm, long bi) {
		if (sm > bi)
			return sameBai(bi, sm);

		List<Long> smArr = new ArrayList<>();
		List<Long> biArr = new ArrayList<>();

		long result = 0;
		long tmsm = sm;
		long max = sm * bi;
		while (sm <= max) {
			smArr.add(sm);
			sm = sm + tmsm;
		}
		long tmbi = bi;
		while (bi <= max) {
			biArr.add(bi);
			bi = bi + tmbi;
		}
		for (long bil : biArr) {
			for (long sml : smArr) {
				if (bil == sml) {
					result = bil;
					return result;
				}
			}
		}
		return result;
	}
}