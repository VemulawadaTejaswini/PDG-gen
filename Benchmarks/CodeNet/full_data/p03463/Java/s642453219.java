import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		try (PrintWriter writer = new PrintWriter(System.out);
			InputReader reader = new InputReader(System.in)) {
			int[] firstCondition = reader.readIntsSplitByDelimiter(" ");
			int distance = firstCondition[2] - firstCondition[1];
			if (distance % 2 == 0) {
				writer.println("Alice");
			} else {
				writer.println("Borys");
			}

			writer.flush();
		}
	}
}


class InputReader implements Closeable, AutoCloseable {
	private final BufferedReader br;

	InputReader(InputStream inputStream) {
		this.br = new BufferedReader(new InputStreamReader(inputStream));
	}

	String readLine() throws IOException {
		return this.br.readLine();
	}

	String[] readStringsSplitByDelimiter(String delimiter) throws IOException {
		return this.readLine().split(delimiter);
	}

	int[] readIntsSplitByDelimiter(String delimiter) throws IOException {
		String[] strings = this.readStringsSplitByDelimiter(delimiter);

		int[] ints = new int[strings.length];
		int stringsLength = strings.length;
		for (int i = 0; i < stringsLength; i++) {
			ints[i] = Integer.parseInt(strings[i]);
		}

		return ints;
	}

	@Override
	public void close() throws IOException {
		br.close();
	}
}