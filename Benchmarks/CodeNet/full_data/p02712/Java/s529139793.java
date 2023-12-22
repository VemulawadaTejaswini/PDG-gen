
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		long result = 0;
		String[] fizzList = new String[Integer.parseInt(n)];

		for(int i = 1; i <= Integer.parseInt(n); i++) {
			if(i % 3 == 0 && i % 5 ==0) {
				fizzList[i - 1] = "FizzBuzz";
			}else if(i % 3 == 0){
				fizzList[i - 1] = "Fizz";
			}else if(i % 5 == 0){
				fizzList[i - 1] = "Buzz";
			}else {
				fizzList[i - 1] = String.valueOf(i);
				result += i;
			}
		}

		System.out.println(result);

	}

}
