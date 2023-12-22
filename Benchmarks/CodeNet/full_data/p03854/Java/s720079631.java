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

		while (!("YES".equals(target)) && !("NO".equals(target)) ) {
			target = stringJudge(target);
		}

		System.out.println(target);

	}

	private static String stringJudge(String target) {
		String DREAM = "dream";
		String DREAMER = "dreamer";
		String ERASE = "erase";
		String ERASER = "eraser";
		String DREAMERASER = "dreameraser";
		String DREAMERASE = "dreamerase";
		String YES = "YES";
		String NO = "NO";


		if (target.indexOf(DREAMERASER) == 0) {
			if (target.length() == 11) {
				return YES;
			}
			return target.substring(11);

		} else if (target.indexOf(DREAMERASE) == 0) {
			if (target.length() == 10) {
				return YES;
			}
			return target.substring(10);

		} else if (target.indexOf(DREAMER) == 0) {
			if (target.length() == 7) {
				return YES;
			}
			return target.substring(7);

		} else if (target.indexOf(ERASER) == 0) {
			if (target.length() == 6) {
				return YES;
			}
			return target.substring(6);

		} else if ( (target.indexOf(DREAM) == 0) || (target.indexOf(ERASE) == 0) ) {
			if (target.length() == 5) {
				return YES;
			}
			return target.substring(5);

		} else {
			return NO;
		}
		
	}

}