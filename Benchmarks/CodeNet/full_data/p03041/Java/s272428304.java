import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		String S = scanner.next();
		char[] sArray = S.toCharArray();
		sArray[K - 1] += 32;
		System.out.println(sArray);
		scanner.close();
	}
}