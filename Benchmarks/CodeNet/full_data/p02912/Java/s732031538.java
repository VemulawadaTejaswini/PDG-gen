import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int productCount = sc.nextInt();
		int numOfDiscountTicket = sc.nextInt();
		
		long[] products = new long[productCount];
		
		for(int i = 0 ; i < products.length ; i++ ) {
			products[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < numOfDiscountTicket ; i++) {
			int maxAt = 0;

			for (int j = 0; j < products.length; j++) {
			    maxAt = products[j] > products[maxAt] ? j : maxAt;
			}
			products[maxAt] = products[maxAt] / 2;
		}
		
		long sum = Arrays.stream(products).sum();
		
		System.out.println(sum);
	}
}