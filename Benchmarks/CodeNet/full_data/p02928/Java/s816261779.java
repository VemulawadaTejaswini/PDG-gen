import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] lines = scanner.nextLine().split(" ");
		int N = Integer.parseInt(lines[0]);
		int K = Integer.parseInt(lines[1]);

		String[] arrays = scanner.nextLine().split(" ");
		int[] newArray = Stream.of(arrays).mapToInt(Integer::parseInt).toArray();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < newArray.length; i++)
			array.add(newArray[i]);

		long B = 0;
		for (int i = 0; i < array.size(); i++) {
			for (int j = i + 1; j < array.size(); j++) {
				if (array.get(i) > array.get(j))
					B++;
			}
		}

		long ans = B * K;
		ans = ans % ((long) Math.pow(10, 9) + 7);
		long ans2 = (long) Math.pow(B, K - 1);
		ans2 = ans2 % ((long) Math.pow(10, 9) + 7);

		System.out.println((ans + ans2) % (long) (Math.pow(10, 9) + 7));

	}

}
