import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		int price = scan.nextInt();

		// check
		for(int i = 1; i <= 50000; i++) {
			if(Math.floor(i * 1.08) == price) {
				System.out.println(i);
				break;
			}
			if(Math.floor(i * 1.08) > price) {
				System.out.println(":(");
				break;
			}
		}

	}
}
