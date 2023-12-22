import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int x = scanner.nextInt();
		int startIndex = x - k + 1;
		StringBuffer resultString = new StringBuffer();
		for (int i = 0; i < k*2-1; i++) {
			resultString.append(startIndex + i);
			resultString.append(" ");
		}
		System.out.println(resultString.toString());
	}

}