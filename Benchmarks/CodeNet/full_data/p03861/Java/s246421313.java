import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

       		String inputString = scanner.nextLine();

		String[] strStdIn = inputString.split(" ", 0);

		long start = Long.parseLong(strStdIn[0]);
		long end = Long.parseLong(strStdIn[1]);
		long divide = Long.parseLong(strStdIn[2]);

		long result = 0;

		for (; start <= end; ) {
			if (start % divide == 0) {
				result++;
				start += divide;
				
			}
			else {
				start++;
			}
		}

		System.out.println(result);
	}
}