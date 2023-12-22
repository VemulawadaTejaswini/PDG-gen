import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			br.readLine();

			OptionalInt count = Stream.of(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.map(Main::getCan2DivCount)
					.min();

			System.out.println(count.orElse(0));
		}
	}

	private static int getCan2DivCount(int num) {
		if (num % 2 == 0) {
			return 1 + getCan2DivCount(num / 2);
		} else {
			return 0;
		}
	}
}
