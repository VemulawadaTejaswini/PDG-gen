import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		card[] c = new card[200000];
		long sum = 0;

		for(int i = 0; i < 200000; i++) {
			c[i] = new card(0, 0);
		}

		for(int i = 0; i < n; i++) {
			c[i] = new card(sc.nextInt(), 1);
		}

		for(int i = 0; i < m; i++) {
			int num = sc.nextInt();
			int val = sc.nextInt();
			c[n+i] = new card(val, num);
		}

		Arrays.sort(c, new Comparator<card>() {
			public int compare(card c1, card c2) {
				return c2.val - c1.val;
			}
		});

		for(card i : c) {
			for(int j = i.num; j > 0 && n > 0; j--) {
				sum += i.val;
				n--;
			}
		}

		System.out.println(sum);
		sc.close();
	}

	private static class card{
		int val; int num;
		card(int a, int b){
			this.val = a;
			this.num = b;
		}
	}
}