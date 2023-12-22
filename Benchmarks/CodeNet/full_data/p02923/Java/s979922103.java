import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = Integer.parseInt(scanner.nextLine());

		String[] line = scanner.nextLine().split(" ");
		long[] H = new long[N];
		ArrayList<Long> height = new ArrayList<Long>();

		for (int i = 0; i < N; i++) {
			H[i] = Long.parseLong(line[i]);
			height.add((long) 0);
		}

		long max = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i; j < N - 1; j++) {
				if (H[j] >= H[j + 1])
					height.set(i, height.get(i) + 1);
				else
					break;
			}
			if (i == 0)
				max = height.get(i);
			else {
				if (max < height.get(i))
					max = height.get(i);
			}
		}

		System.out.println(max);

	}

}
