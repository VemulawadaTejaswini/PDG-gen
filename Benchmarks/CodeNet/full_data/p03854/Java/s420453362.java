import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String target = scanner.nextLine();

		String DREAM = "dream";
		String DREAMER = "dreamer";
		String ERASE = "erase";
		String ERASER = "eraser";

		if ( (target.indexOf(DREAM) == -1) && (target.indexOf(DREAMER) == -1) &&
			(target.indexOf(ERASE) == -1) && (target.indexOf(ERASER) == -1) ) {
			System.out.println("NO");
			return;
		}

		stringJudge(target);

	}

	private static void stringJudge(String target) {
		String DREAM = "dream";
		String DREAMER = "dreamer";
		String ERASE = "erase";
		String ERASER = "eraser";

		if (target.indexOf(DREAMER) == 0) {
			if (target.length() == 7) {
				System.out.println("YES");
				return;
			}
			stringJudge(target.substring(7));

		} else if (target.indexOf(ERASER) == 0) {
			if (target.length() == 6) {
				System.out.println("YES");
				return;
			}
			stringJudge(target.substring(6));

		} else if ( (target.indexOf(DREAM) == 0) || (target.indexOf(ERASE) == 0) ) {
			if (target.length() == 5) {
				System.out.println("YES");
				return;
			}
			stringJudge(target.substring(5));

		} else {
			System.out.println("NO");
			return;
		}
		
	}

}