import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		String result = isFulfill(input) ? "AC" : "WA";
		System.out.println(result);
	}

	public static boolean isFulfill(String input) {

		int size = input.length();
		int countC = 0;
		for (int i = 0; i < size; i++) {
			if (i == 0) {
				if (!checkTopCharacter(input)) {
					return false;
				}
			} else if (i == 1 || i == size-1) {
				if (isUpperCase(input, i)) {
					return false;
				}
			} else if (i >=2  && i < size-1	) {
				if (isUpperCase(input, i) && !"C".equals(String.valueOf(input.charAt(i)))) {
					return false;
				}
				if (countC == 1) {
					if (isUpperCase(input, i)) {
						return false;
					}
				}
				if (isUpperCase(input, i) && "C".equals(String.valueOf(input.charAt(i)))) {
					countC++;
					if (countC == 2) {
						return false;
					}
				}
			}
		}
		if (countC == 0) {
			return false;
		}

		return true;
	}

	public static boolean checkTopCharacter(String input) {
		if (!Character.isUpperCase(input.charAt(0))) {
			return false;
		}
		if (!"A".equals(String.valueOf(input.charAt(0)))) {
			return false;
		}
		return true;
	}

	public static boolean isUpperCase(String input, int index) {
		return Character.isUpperCase(input.charAt(index));
	}

}
