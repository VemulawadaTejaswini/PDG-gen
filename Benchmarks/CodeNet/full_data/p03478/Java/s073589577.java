import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n4 = 0;
		int n3 = 0;
		int n2 = 0;
		int n1 = 0;
		int sum = 0;
		int ana = 0;
		for (int i = 1; i <= n; i++) {
			if (i < 10) {
				if (a <= i && i <= b) {
					ana = i;
				}
			} else if (10 <= i && i < 100) {
				n2 = i / 10;
				n1 = i - n2 * 10;
				ana = n2 + n1;
			} else if (100 <= i && i < 1000) {
				n3 = i / 100;
				n2 = (i - n3 * 100) / 10;
				n1 = n3 - n2 * 10;
				ana = n3 + n2 + n1;
			} else {
				ana = 1;
			}
			if (a <= ana && ana <= b) {
				sum += i;
				ana = 0;
			}
		}
		System.out.println(sum);
	}

}
