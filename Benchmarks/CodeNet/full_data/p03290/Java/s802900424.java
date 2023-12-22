import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int g = sc.nextInt();
		int p[] = new int[d];
		int c[] = new int[d];
		for (int i = 0; i < d; i++) {
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		int counts[] = new int[d];
		outside: for (int k = d; k > 0; k-- ) {
			int count = 0;
			for (int i = d; i > 0; i--) {
				for (int j = 0; j < p[i-1]; j++) {
					if (g <= 0) {
						counts[k-1] = count;
						continue outside;
					}
					g -= 100 * i;
					count++;
				}
			g -= c[i-1]; //jが尽きたらボーナス加点
			}
		}
		int count_min = counts[d-1];
		for (int i = d; i > 0; i--) {
			int v = counts[i-1];
			if (v < count_min && v != 0) {
				count_min = v;
			}
		}
		System.out.println(count_min);
	}
}