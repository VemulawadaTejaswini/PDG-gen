import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int hundredsDigit = n / 100;
		int tensDigit = (n - (hundredsDigit * 100)) / 10;
		int onesDigit = n % 10;
		int DigitMax = hundredsDigit;

		if (tensDigit > DigitMax) {
			DigitMax = tensDigit;
		}
		if (onesDigit > DigitMax) {
			DigitMax = onesDigit;
		}
		int answer = (DigitMax * 100) + (DigitMax * 10) + DigitMax;
		System.out.println(answer);
	}
}