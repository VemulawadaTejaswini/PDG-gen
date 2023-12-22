import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int maxCake = N/4;
		int maxDounut = N/7;
		final int CACE_PRICE= 4;
		final int DOUNUT_PRICE= 7;


		boolean isOK = false;
		for (int i = 0; i <= maxCake ; i++) {
			for (int j = 0; j <= maxDounut ; j++) {
				if ((CACE_PRICE*i)+ (DOUNUT_PRICE*j) == N) {
					isOK = true;
					break;
				}
			}
		}
		if (isOK) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
