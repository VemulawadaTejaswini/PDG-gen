import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int m = scan.nextInt();
		int aPrice[] = new int[a];
		int bPrice[] = new int[b];
		int minPrice = Integer.MAX_VALUE;
		for (int i = 0; i < a ; i++) {
			aPrice[i] = scan.nextInt();
		}
		for (int i = 0; i < b ; i++) {
			bPrice[i] = scan.nextInt();
		}
		for (int i = 0; i < aPrice.length; i++) {
			for (int j = 0; j < bPrice.length; j++) {
				int price = aPrice[i] + bPrice[j];
				if(price < minPrice) {
					minPrice = price;
				}
			}
		}

		for (int i = 0; i < m ; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int c = scan.nextInt();
			int price = aPrice[x-1] + bPrice[y-1] - c;
			if(price < minPrice) {
				minPrice = price;
			}
		}
		System.out.println(minPrice);
	}

}

