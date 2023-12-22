import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int ans = 0;
		int suma = 0;
		for (int i = 0; i < 100000; i++) {
			int sumb = i * 100;
			if (sumb == N) {
				ans = 1;
				break;
			}
			for (int j = 0; j < 100000 && sumb < N; j++) {
				int sumc = j * 101 + sumb;
				if (sumc == N) {
					ans = 1;
					break;
				}
				for (int k = 0; k < 100000 && sumc < N; k++) {
					int sumd = k * 102 + sumc;
					if (sumd == N) {
						ans = 1;
						break;
					}
					for (int l = 0; l < 100000 && sumd < N; l++) {
						int sume = l * 103 + sumd;
						if (sume == N) {
							ans = 1;
							break;
						}
						for (int m = 0; m < 100000 && sume < N; m++) {
							int sumf = m * 104 + sume;
							if (sumf == N) {
								ans = 1;
								break;
							}
							for (int n = 0; n < 100000 && sumf < N; n++) {
								int sumg = n * 105 + sumf;
								if (sumg == N) {
									ans = 1;
									break;
								}
							}
						}
					}
				}
			}
			
		}
		System.out.println(ans);
	}

}
