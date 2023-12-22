import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int H = s.nextInt();
		int HOrigin = H;
		int[] ai = new int[N];
		int[] bi = new int[N];
		int aiMax = 0;
		int biSum = 0;
		int count = 0;
		int cnt2 = 0;

		for (int i = 0; i < N; i++) {
			ai[i] = s.nextInt();
			aiMax = Math.max(aiMax, ai[i]);
			bi[i] = s.nextInt();
			biSum += bi[i];
		}
		Arrays.sort(bi);
		for (int i = N - 1; 0 <= i; i--) {
			H = H - bi[i];
			count++;
			if (H <= 0) {
				break;
			}
		}

		if ((H <= 0) && (count < HOrigin / aiMax + 1)) {
			System.out.println("if");
			System.out.println(count);
			return;
		} else if ((HOrigin / aiMax + 1) < count) {
			System.out.println("elseif");
			System.out.println(HOrigin / aiMax + 1);
			return;
		}

		for (int j = 1, k=0; j < (H / aiMax + 1); j++) {

			int result = H - ((aiMax * j) + (biSum - bi[j]));
			cnt2++;
			if (result <= 0) {
				int idx = j;
				System.out.println(j + (N - cnt2));
				break;
			}
		}
	}
}
