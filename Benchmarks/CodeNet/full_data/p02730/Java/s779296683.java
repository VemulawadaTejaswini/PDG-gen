import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (IsTolk(input.split("")) && IsTolk(input.substring(0, ((input.length() - 1) / 2)).split(""))
				&& IsTolk(input.substring(((input.length() + 3) / 2) - 1).split(""))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean IsTolk(String[] split) {
		boolean res = true;
		for (int i = 0; i < split.length / 2; i++) {
			if (!(split[i].equals(split[split.length - i - 1]))) {
				res = false;
				break;
			}
		}
		return res;
	}
}