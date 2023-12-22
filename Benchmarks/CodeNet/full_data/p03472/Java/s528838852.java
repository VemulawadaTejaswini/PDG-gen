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
		int count = 0;

		for (int i = 0; i < N; i++) {
			ai[i] = s.nextInt();
			aiMax = Math.max(aiMax, ai[i]);
			bi[i] = s.nextInt();
		}
		Arrays.sort(bi);
		for (int i = N - 1; 0 <= i; i--) {
			H = H - bi[i];
			count++;
			if(H<=0){
				break;
			}
		}

		if (H <= 0) {
			System.out.println(count);
		} else if ((HOrigin / aiMax + 1) < count) {
			System.out.println(HOrigin / aiMax );
		} else {
			System.out.println((H / aiMax)  + count);
		}

	}
}
