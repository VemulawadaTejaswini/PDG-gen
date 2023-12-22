import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		int count = 0;

		for(int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}

		Arrays.parallelSort(l);

		for(int i = n-1; i >= 2; i--) {
			if(i != n-1 && l[i] == l[i+1]) continue;

			B:for(int a = i-1; a >= 1; a--) {
				if(a != i-1 && l[a] == l[a+1]) continue;

				for(int b = a-1; b >= 0; b--) {
					if(b != a-1 && l[b] == l[b+1]) continue;

					if(l[i] < l[a]+l[b]) {
						count++;
						//System.out.printf("%d %d %d%n", l[i], l[a],l[b]);
					}else {
						break B;
					}

				}
			}

		}

		System.out.println(count);

		sc.close();
	}
}