import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int count = 0;			// 操作を行った数

		for (int ia = 0; ia < a, ia++) {
			for (int ib = 0; ib < b, ib++) {
				for (int ic = 0; ic < c, ic++) {
					if (x == a * 50 + b * 100 + c * 500) {
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}
}