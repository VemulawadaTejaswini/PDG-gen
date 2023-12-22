import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[][] next = new int[n+1][10];
		int count = 0;

		for(int i = 0; i < 10; i++) next[n][i] = n;

		for (int i = n-1; i >= 0; i--) {
			for (int j = 0; j < 10; j++) {
				next[i][j] = next[i+1][j];
			}
			next[i][s.charAt(i)-'0'] = i;
		}

		/*for (int i = 0; i <= n; i++) {
			System.out.println(Arrays.toString(next[i]));
		}*/

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					int first = next[0][i];
					if(first >= n) continue;
					else {
						int second = next[first+1][j];
						if(second >= n) continue;
						else {
							int third = next[second+1][k];
							if(third >= n) continue;
							else {
								count++;
							}

						}
					}
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}