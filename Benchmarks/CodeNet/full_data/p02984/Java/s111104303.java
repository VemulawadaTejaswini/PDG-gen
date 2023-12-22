
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] dom = new long[n];
		long[] mt = new long[n];
		for(int i = 0; i < n; i++) {
			dom[i] = sc.nextLong();
		}
		for(long i = dom[1]; i > -1; i--) {
			boolean suc = true;
			mt[0] = i * 2;
			for(int j = 0; j < n; j++) {
				long tmp = 2 * dom[j] - mt[j];
				if(tmp >= 0) {
					if(j != n - 1) {
						mt[j + 1] = tmp;
					} else if(tmp != mt[0]) {
						suc = false;
						break;
					}
				} else {
					suc = false;
					break;
				}
			}
			if(suc) {
				for(int j = 0; j < n; j++) {
					System.out.print(mt[j] + " ");
				}
				System.out.println();
				break;
			}
		}

	}

}
