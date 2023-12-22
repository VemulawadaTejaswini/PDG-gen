import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int nSum = 0;
		for (int i = 1; i <= String.valueOf(n).length(); i++) {
			nSum += getDigit(n, i);
		}
		if (n % nSum == 0) {
			System.out.println("Yes");		
		} else {
			System.out.println("No");
		}
	}

	public static int getDigit(int n, int i) {
		int a = n / (int)Math.pow(10, i);
		a = a * (int)Math.pow(10, i);
		n = n - a;
		n = n / (int)Math.pow(10, i - 1);
		return n;
	}
}