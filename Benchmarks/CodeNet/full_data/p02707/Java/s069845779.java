import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();

		Map<Integer, Integer> relationMap = new TreeMap<>();
		//初期セット
		IntStream.rangeClosed(1, n).forEach(i -> relationMap.put(i, 0));

		for (int j = 2; j <= n; j++) {
			int managerNumber = stdIn.nextInt();
			relationMap.replace(managerNumber, relationMap.get(managerNumber)+1);

		}

		stdIn.close();

		for (Entry<Integer, Integer> e : relationMap.entrySet()) {
			System.out.println(e.getValue());
		}

	}

}