import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int h = sc.nextInt();
			int w = sc.nextInt() + 2;
			sc.nextLine();

			String[] gazo = new String[h];
			//gazo[0] = String.format("%", args)
			for (int i = 0; i < h; i++) {
				gazo[i] = new StringBuilder().append("#").append(sc.nextLine()).append("#").toString();
			}

			IntStream.range(0, w).forEach(i -> System.out.print("#"));
			System.out.println();
			Arrays.stream(gazo).forEach(s -> System.out.println(s));
			IntStream.range(0, w).forEach(i -> System.out.print("#"));
			System.out.println();

		} finally {
			sc.close();
		}
	}
}