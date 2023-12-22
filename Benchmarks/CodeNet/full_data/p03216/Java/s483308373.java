import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int k = sc.nextInt();
			long total = 0;
			for (int j = 2; j < n; j++) {
				if (arr[j] == 'C') {
					long dCount = 0;
					long sum = 0;
					for (int l = Math.max(j - k + 1, 0); l < j; l++) {
						if (arr[l] == 'D') {
							dCount++;
						} else if (arr[l] == 'M') {
							sum += dCount;
						}
					}
					total += sum;
				}
			}
			System.out.println(total);
		}
	}
}