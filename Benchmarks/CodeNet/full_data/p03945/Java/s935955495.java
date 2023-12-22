import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static void solve(Scanner s) {
		String str = s.next();
		String[] array = str.split("");
		List<String> S = new ArrayList<>();

		for (String a : array) {
			S.add(a);
		}

		boolean endFlg = check(S, S.get(0));

		int result = Integer.MAX_VALUE;
		if (endFlg) {
			result = 0;
		} else {

			String first = S.get(0);
			String last = S.get(S.size() - 1);

			if (first.equals("B") && last.equals("B")) {
				result = add(S, "W", 1);
			} else if (first.equals("W") && last.equals("W")) {
				result = add(S, "B", 1);
			} else {
				if (first.equals("B")) {
					result = add(S, "W", 1);
				} else {
					result = add(S, "B", 1);
				}
			}
		}

		System.out.println(result);
	}

	private static int add(List<String> S, String addStr, int count) {

		S.add(0, addStr);
		for (int i = 1; i < S.size(); i++) {
			if (!S.get(i).equals(addStr)) {
				S.set(i, addStr);
			} else {
				break;
			}
		}

		if (check(S, addStr)) {
			return count;
		} else {
			if (addStr.equals("B")) {
				count = add(S, "W", count + 1);
			} else {
				count = add(S, "B", count + 1);
			}
		}

		return count;
	}

	private static boolean check(List<String> sList, String addStr) {
		if (addStr.equals("B")) {
			if (sList.contains("W")) {
				return false;
			} else {
				return true;
			}
		} else {
			if (sList.contains("W")) {
				return false;
			} else {
				return true;
			}
		}
	}
}