import java.util.Scanner;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		String firstInput = scan.nextLine();
		int inputCount = Integer.parseInt(firstInput.substring(0, 1));
		int minTime = Integer.parseInt(firstInput.substring(1,2));
		int minCost = 1001;
		for(int i = 0; i < inputCount; i++) {
			String input = scan.nextLine();

			if(Integer.parseInt(input.substring(1, 2)) < minCost
					&& Integer.parseInt(input.substring(1, 2)) <= minTime) {
				minCost = Integer.parseInt(input.substring(1, 2));
			}
		}
		if(minCost < 1001) {
			System.out.println(minCost);
		} else {
			System.out.println("TLE");
		}
	}
}