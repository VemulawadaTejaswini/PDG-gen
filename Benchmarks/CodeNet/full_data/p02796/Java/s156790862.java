import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long mod = 1000000007;

	public static void main(String[] args) {
		// AtCoder_B
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = N;
		long X[] = new long[N];
		long rangeL[] = new long[N];
		long rangeR[] = new long[N];
		int conflict[] = new int[N];
		Arrays.fill(conflict, 0);

		for(int i=0; i<N; i++) {
			X[i] = sc.nextLong();
			long L = sc.nextLong();
			rangeL[i] = X[i]-L;
			rangeR[i] = X[i]+L;

			for(int j=1; j<=i; j++) {
				if((X[i-j] < X[i] && rangeL[i] < rangeR[i-j]) || (X[i] < X[i-j] && rangeL[i-j] < rangeR[i])) {
					conflict[i]++;
					conflict[i-j]++;
				}
			}
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		int conflictMax = 0;
		do {
			conflictMax = 0;
			int deleteArm = 0;

			for(int i=0; i<N; i++) {
				if(conflictMax < conflict[i]) {
					conflictMax = conflict[i];
					deleteArm = i;
				}
			}
			if(conflictMax == 0) {
				break;
			} else {
				for(int i=0; i<N; i++) {
					if(rangeL[deleteArm] < rangeR[i] || rangeL[i] < rangeR[deleteArm]) {
						conflict[i]--;
					}
				}
				conflict[deleteArm] = 0;
				ans--;
			}
		} while(conflictMax > 0);

		System.out.println(ans);

	}
}
