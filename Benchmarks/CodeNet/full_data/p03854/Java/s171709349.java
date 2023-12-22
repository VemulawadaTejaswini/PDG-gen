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
		String REV_DREAM = "dream";
		String REV_DREAMER = "dreamer";
		String REV_ERASE = "erase";
		String REV_ERASER = "eraser";
		String YES = "YES";
		String NO = "NO";

		int target_length = target.length();
		System.out.println(target);

		if ( (target_length - 7 >= 0) && (target.lastIndexOf(REV_DREAMER) == target_length - 7) ) {
			if (target_length == 7) {
				return YES;
			}
			return target.substring(0, target_length - 7);

		} else if ( (target_length - 6 >= 0) && (target.lastIndexOf(REV_ERASER) == target_length - 6) ) {
			if (target_length == 6) {
				return YES;
			}
			return target.substring(0, target_length - 6);

		} else if ( (target_length - 5 >= 0) && ( (target.lastIndexOf(REV_DREAM) == target_length - 5) || (target.lastIndexOf(REV_ERASE) == target_length - 5) )) {
			if (target_length == 5) {
				return YES;
			}
			return target.substring(0, target_length - 5);

		} else {
			return NO;
		}
	}

}