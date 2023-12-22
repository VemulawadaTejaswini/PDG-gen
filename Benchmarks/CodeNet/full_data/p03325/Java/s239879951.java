import java.util.Scanner;

public class Main {
	private long[] elems;
	private long result;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] tokens = in.nextLine().split(" ");
		Main main = new Main(tokens);
		System.out.println(main.result);
		in.close();
	}

	public Main(String[] tokens) {
		this.elems = new long[tokens.length];
		for (int i = 0; i < tokens.length; ++i) {
			elems[i] = Long.parseLong(tokens[i]);
		}

		for (int i = 0; i < elems.length; ++i) {
			result += divCount(elems[i]);
		}
	}

	private int divCount(long num) {
		int result = 0;
		while (true) {
			if (num % 2 != 0) {
				break;
			}
			result++;
			num = num / 2;
		}
		return result;

	}

}
