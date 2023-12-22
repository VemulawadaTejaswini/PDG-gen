import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int x[] = new int[n];
			int y[] = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			
			int p = 0;
			int q = 0;
			int result = 2147483647;
			for (int i = 1; i < n; i++) {
				for (int j = 1; j < n; j++) {
					p = x[i] - x[i - 1];
					q = y[j] - y[j - 1];
					int count = 1;
					for (int k = 1; k < n; k++) {
						if (x[k] - x[k - 1] == p && y[k] - y [k - 1] == q) {
						} else {
							count ++;
						}
					}
					if (count < result) {
						result = count;
					}
				}
			}
			System.out.println(result);
		}
	} 
}
