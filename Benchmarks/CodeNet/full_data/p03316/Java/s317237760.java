import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int numOrigin = num;
		int sumEachDigit = 0;
		while(num>0) {
			sumEachDigit += num % 10;
			num /= 10;
		}
		if(numOrigin%sumEachDigit==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}