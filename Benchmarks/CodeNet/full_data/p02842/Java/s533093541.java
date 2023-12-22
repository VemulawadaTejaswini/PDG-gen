import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int nonTaxedPrice = (int)Math.ceil(N/1.08);
		if(Math.floor(nonTaxedPrice * 1.08) == N) {
			System.out.println(nonTaxedPrice);
		} else {
			System.out.println(":(");
		}
	}
}