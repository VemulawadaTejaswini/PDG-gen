import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String inputA = sc.next();
		long A = Long.parseLong(inputA);
		double doubleA = Double.parseDouble(inputA);

		for (int i = (int) Math.sqrt(doubleA); i > 0; i--) {
			if (A % i == 0) {
				long x = i;
				long y = A / i;
				System.out.print(x + y - 2);
				break;
			}
		}
		
	}
}
