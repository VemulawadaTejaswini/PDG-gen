import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());

		int result = 0;
		for(int dIdx = 0; dIdx < 31; dIdx++) {
			int digit = 1;
			if(num % 2 != 0) {
				digit <<= dIdx;
				result += digit;
				num--;
			}
			num /= -2;
		}

		System.out.println(Integer.toBinaryString(result));
	}
}
