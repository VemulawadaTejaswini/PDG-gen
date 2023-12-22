import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int corner = scanner.nextInt();
		List<Integer> sideLengthList = new ArrayList<Integer>();

		while(scanner.hasNext()) {
			sideLengthList.add(scanner.nextInt());
		}

		Collections.sort(sideLengthList);
		int maxSideLength = sideLengthList.get((sideLengthList.size() -1));
		sideLengthList.remove((sideLengthList.size() -1));

		int totalLength = 0;
		for(int sideLength : sideLengthList) {
			totalLength += sideLength;
		}

		String result = (maxSideLength < totalLength) ? "YES" : "NO";

		System.out.println(result);
		
		scanner.close();
	}

}