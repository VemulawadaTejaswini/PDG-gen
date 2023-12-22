import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		for (int i = 1; i <= 1009; i++) {
//			int a = i * 8 / 100;
//			int b = i / 10;
//			System.out.printf("i:%d, a:%d(%d), b: %d\n", i, a, a * 100 / 8, b);
//		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = -1;
		
		int nonTaxed = a * 100 / 8;
		if (nonTaxed % 5 != 0)
			nonTaxed++;
		
		nonTaxed = Math.max(nonTaxed, b * 10);
		
		if (nonTaxed * 8 / 100 == a)
			ans = nonTaxed;
		
		System.out.println(ans);
		sc.close();
	}
}
