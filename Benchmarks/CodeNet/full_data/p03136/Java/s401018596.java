import java.util.*;

public class Main {
	public static void main(String[] args) {

		try {

			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			List<Integer> lengthList = new ArrayList<Integer>();
			int counter = 0;


			for (int i = 0; i < n; i++) {
				lengthList.add(scanner.nextInt());
			}
			scanner.close();

			int longestLength = Collections.max(lengthList);
			for (int length : lengthList) {
				counter++;
				if (length == longestLength) {
					break;
				}
			}

			lengthList.remove(counter - 1);

			int sum = 0;
			for (int remainLengths : lengthList) {
				sum += remainLengths;
			}

			if (longestLength < sum) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		} catch(Exception e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}