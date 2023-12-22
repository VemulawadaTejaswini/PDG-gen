import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		double max = 0;
		int maxTotal = 0;
		int maxSugar = 0;
		for (int i = 0; i * a * 100 <= f; i++) {
			for (int j = 0; i * a * 100 + j * b * 100 <= f; j++) {
				for (int k = 0; i * a * 100 + j * b * 100 + k * c <= f; k++) {
					if ((i * a + j * b) * e < k * c) {
						break;
					}
					for (int l = 0; i * a * 100 + j * b * 100 + k * c + l * d <= f; l++) {
						if ((i * a + j * b) * e < k * c + l * d) {
							break;
						}
						double dd = (100.0 * (k * c + l * d)) / (i * a * 100 + j * b * 100 + k * c + l * d);
						if (max < dd) {
							max = dd;
							maxTotal = i * a * 100 + j * b * 100 + k * c + l * d;
							maxSugar = k * c + l * d;
						}
					}
				}
			}
		}
		System.out.println(maxTotal + " " + maxSugar);
	}
}
