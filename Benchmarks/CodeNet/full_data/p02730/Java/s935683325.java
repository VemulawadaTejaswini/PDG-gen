import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		boolean res = true;
		res = IsTolk(input.split(""));
		res = IsTolk(input.substring(0, (input.length() - 2) / 2).split(""));
		res = IsTolk(input.substring((input.length() + 2) / 2).split(""));
		System.out.println(res ? "Yes" : "No");
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
