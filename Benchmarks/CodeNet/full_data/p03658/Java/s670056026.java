import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int i, sum = 0;
		int l[] = new int[n], max[] = new int[n];

		for (i = 0; i < n; i++) {
			l[i] = sc.nextInt();
			max[n] = 0;
		}
		for (i = 0; i < k; i++) {
			for (int j = 0; j < n; j++) {
				if (max[i] < l[j]) {
					max[i] = l[j];
					break;
				}
			}

		}
		for (int j = 0; j < k; j++) {
			sum += max[j];
		}
		System.out.println(sum);
	}
}
