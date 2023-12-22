
import java.util.Scanner;

public class Main {

	static int first = -1;
	static int second = -1;
	static int third = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long result = 1;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			long mul = countNum(a);
			addNum(a);
			result = result * mul % 1000000007;
		}
		System.out.println(result);
	}

	public static int countNum(int num) {
		int count = 0;
		if (first == num - 1) {
			count++;
		}
		if (second == num - 1) {
			count++;
		}
		if (third == num - 1) {
			count++;
		}
		return count;
	}

	public static void addNum(int num) {
		if (first == num - 1) {
			first++;
			return;
		}
		if (second == num - 1) {
			second++;
			return;
		}
		if (third == num - 1) {
			third++;
		}
	}
}