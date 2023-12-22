import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		if (number1 < 10 && number2 < 10) {
			System.out.println(number1 * number2);
		}else {
			System.out.println("-1");
		}
    }
}
