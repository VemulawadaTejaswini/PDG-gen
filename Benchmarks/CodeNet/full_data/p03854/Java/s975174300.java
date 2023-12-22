import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String scStr = scanner.nextLine();
		int count = scStr.length() / 5;

		String dream = "dream";
		String dreamer = "dreamer";
		String erase = "erase";
		String eraser = "eraser";

		boolean result = false;
		boolean isEnd = false;

		StringBuilder sb = new StringBuilder(scStr);
		for (int i = 0; i <= count; i++) {
			if (isEnd == true)
				break;
			if (scStr.startsWith(dream)) {
				scStr = scStr.substring(5);
			} else if (scStr.startsWith(dreamer)) {
				scStr = scStr.substring(6);
			} else if (scStr.startsWith(erase)) {
				scStr = scStr.substring(5);
			} else if (scStr.startsWith(eraser)) {
				scStr = scStr.substring(6);
			} else if (scStr.length() <= 6) {
				isEnd = true;
				if (scStr.length() == 0) {
					result = true;
				} else if (scStr.length() == 5 && (scStr.startsWith(dreamer) || scStr.startsWith(eraser))) {
					result = true;
				} else if (scStr.length() == 6 && (scStr.startsWith(dream) || scStr.startsWith(eraser))) {
					result = true;
				}
			}
		}
		if (result == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}