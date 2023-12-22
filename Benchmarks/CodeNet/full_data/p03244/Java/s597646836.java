
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] odd = new int[100001]; // iが奇数であるviからなる数列Oについて、1-100000までのそれぞれの数が存在する個数
		int[] even = new int[100001];
		for (int i = 1; i <= n; i++) {
			int v = sc.nextInt();
			if (i%2 != 0) {
				odd[v]++;
			} else {
				even[v]++;
			}
		}

		int odd_max1 = 0;
		int odd_max2 = 0;
		for (int i = 1; i < 100000; i++) {
			if (odd[i] > odd[odd_max1]) {
				odd_max2 = odd_max1;
				odd_max1 = i;
			}
		}
		int even_max1 = 0;
		int even_max2 = 0;
		for (int i = 2; i < 100001; i++) {
			if (even[i] > even[even_max1]) {
				even_max2 = even_max1;
				even_max1 = i;
			}
		}
		int rewrite = n;
		if (odd_max1 == even_max1) {
			rewrite = Math.min(n - odd_max1 -even_max2, rewrite - odd_max2 - even_max1);
		} else {
			rewrite = n - odd[odd_max1] - even[even_max1];
		}
		System.out.println(rewrite);
	}
}
