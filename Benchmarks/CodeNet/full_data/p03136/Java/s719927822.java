import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int corner = scanner.nextInt();
		int totalLength = 0;
		int maxSideLength = 0;

		for(int i = 0; i < corner; ++i) {
			int temp = scanner.nextInt();
			maxSideLength = Math.max(maxSideLength, temp);
			totalLength += temp;
		}
		totalLength -= maxSideLength;

		String result = (maxSideLength < totalLength) ? "Yes" : "No";

		System.out.println(result);

		scanner.close();

	}

}