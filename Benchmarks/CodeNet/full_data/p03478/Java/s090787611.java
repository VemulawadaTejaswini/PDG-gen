import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] num = new int[3];
		int sum = 0;
		int ana = 0;
		for (int i = 1; i <= n; i++) {
			if (i < 10) {
				if (a <= i && i <= b) {
					ana = i;
				}
			} else if (10 <= i && i < 100) {
				num[1] = i / 10;
				num[0] = i - num[1] * 10;
				ana = num[1] + num[0];
			} else if (100 <= i && i < 1000) {
				num[2] = i / 100;
				num[1] = (i - num[2] * 100) / 10;
				num[0] = num[2] - num[1] * 10;
				ana = num[2] + num[1] + num[0];
			} else if (i == 1000) {
				ana = 1;
			}
			if (a <= ana && ana <= b) {
				sum += i;
				ana = 0;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
