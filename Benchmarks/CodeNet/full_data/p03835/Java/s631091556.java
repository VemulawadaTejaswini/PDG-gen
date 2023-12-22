import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
       		String inputString = scanner.nextLine();
		String[] strStdIn = inputString.split(" ", 0);
		
		int initialNum = Integer.parseInt(strStdIn[0]);
		int totalNum = Integer.parseInt(strStdIn[1]);
		int count = 0;

		if (3 * initialNum == totalNum) {
			System.out.println("1");
			return;
		} else if (3 * initialNum < totalNum) {
			System.out.println("0");
			return;
		}

		int calculatedNum = (3 *initialNum) - totalNum;
		int terminater = 0;

		if ((initialNum - calculatedNum) > 0) {
			terminater = initialNum - calculatedNum;
		}

		count = 3 * (initialNum - terminater);

/*		for (int i=initialNum; i >= terminater; i--) {
			for (int m=initialNum; m >= terminater; m--) {
				for (int n=initialNum; n >= terminater; n--) {
					if ((3 *initialNum) - (i + m + n) == calculatedNum) {
						count++;
					}
				}
			}
*/		}

		System.out.println(count);
	}
}