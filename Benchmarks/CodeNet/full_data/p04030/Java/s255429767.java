import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String keyBoard = sc.next();
		int inputSize = keyBoard.length();
		String output = "";

		for(int i = 0; i < inputSize; i++) {
			String word = keyBoard.substring(i, i+1);
			if (word.equals("0") || word.equals("1")) {
				output += word;
			} else {
				if (!"".equals(output)) {
					output = output.substring(0, output.length() - 1);
				}
			}
		}

		System.out.println(output);

		sc.close();
	}
}
