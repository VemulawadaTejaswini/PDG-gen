import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		// check
		int count = 0;
		while(true){
			if(count >= 5) {
				count = -1;
				break;
			}
			if(a % 2 != 0 | b % 2 != 0 | c % 2 != 0){
				break;
			}
			int tempA = a / 2;
			int tempB = b / 2;
			int tempC = c / 2;
			a = tempB + tempC;
			b = tempA + tempC;
			c = tempA + tempB;
			count++;
		}

		// answer
		System.out.println(count);

	}
}

