import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		for(num1 = 1 ; num1 < 10 ; num1++) {
			for(num2 = 1 ; num2 < 10 ; num2++) {
				sum = num1 * num2;
			} 
		} if(input == sum) {
			System.out.println("YES");
		} else System.out.println("No");
	}
}