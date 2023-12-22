import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();
		int x500 = x / 500;
		if(x500 > a) {
			x500 = a;
		}
		int count = 0;
		for(int i = 0; i <= x500; i++) {
			int x100 = (x - (500 * i)) / 100;
			if(x100 > b) {
				x100 = b;
			}
			for(int j = 0; j <= x100; j++) {
				int x50 = (x - (500 * i) - (100 * j)) / 50;
				if(x50 > c) {
					x50 = c;
				}
				for(int k = 0; k <= x50; k++) {
					int money = (500 * i) + (100 * j) + (50 * k);
					if(money == x) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}