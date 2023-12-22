import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int n = scan.nextInt();
		List<Integer> distanceList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int distance = scan.nextInt();
			distanceList.add(distance);
		}

		int minDistance = 0;
		for (int i = 1; i < n; i++) {
			minDistance += distanceList.get(i);
		}

		int minRDistance = 0;
		for (int i = 1; i < n; i++) {
			minRDistance += k - distanceList.get(n - 1);
		}

		System.out.println(Math.min(minDistance, minRDistance));

		scan.close();
	}

}
