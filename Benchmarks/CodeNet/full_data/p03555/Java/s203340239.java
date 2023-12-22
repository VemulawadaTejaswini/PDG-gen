import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public final static String YES = "YES";
	public final static String NO = "NO";

	public static void main(String[] args) {

		Main myself = new Main();
		myself.execute();

	}

	/**
	 * 実処理メソッド
	 */
	public void execute() {

		final List<String> lines = readStdin();

		final InputData inputData = parse(lines);

		System.out.print(inputData.isSameOnRotateing180() ? YES : NO);

	}

	/**
	 * @return
	 */
	private List<String> readStdin() {
		List<String> lines = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8)).lines()
				.collect(Collectors.toList());
		return lines;
	}

	/**
	 * @param inputlines
	 * @return
	 */
	private InputData parse(List<String> inputlines) {

		InputData data = new InputData();

		String firstLine = inputlines.get(0);
		String secondLine = inputlines.get(1);

		data.c11 = firstLine.charAt(0);
		data.c12 = firstLine.charAt(1);
		data.c13 = firstLine.charAt(2);

		data.c21 = secondLine.charAt(0);
		data.c22 = secondLine.charAt(1);
		data.c23 = secondLine.charAt(2);

		return data;
	}

	/**
	 * 
	 *
	 */
	private class InputData implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = -6938809350516466787L;

		/**
		 * 
		 */
		public char c11;

		/**
		 * 
		 */
		public char c12;

		/**
		 * 
		 */
		public char c13;

		/**
		 * 
		 */
		public char c21;

		/**
		 * 
		 */
		public char c22;

		/**
		 * 
		 */
		public char c23;

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		public boolean isSameOnRotateing180() {

			return c11 == c23 && c12 == c22 && c13 == c21;
		}

	}

}
