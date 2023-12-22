import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int e = Integer.parseInt(sc.next());
		int f = Integer.parseInt(sc.next());
		int water = 0;
		int sugar = 0;
		for (double i = 0; i < f; i += 100 * a) {
			for (double j = 0; i + j < f; j += 100 * b) {
				for (double k = 0; i + j + k <= f; k += c) {
					for (double l = 0; i + j + k + l <= f; l += d) {
						if ((k != 0 || l != 0) && ((k + l) / ((i + j) / 100)) <= e) {
							if ((water == 0 && sugar == 0)|| 100 * sugar / water < 100 * (k + l) / (i + j + k + l)) {
								water = (int)(i + j + k + l);
								sugar = (int)(k + l);
							}
						}
					}
				}
			}
		}
		System.out.println(water + " " + sugar);
	}
}