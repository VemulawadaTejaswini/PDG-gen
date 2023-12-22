import java.util.*;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		char[] inS = stdin.next().toCharArray();
		List<Integer> moveList = new ArrayList<>();
		int move = 0;
		for (char s : inS) {
			if (s == 'F') {
				move++;
			}
			else {
				moveList.add(move);
				move = 0;
			}
		}
		moveList.add(move);

		int inX = stdin.nextInt();
		int inY = stdin.nextInt();

		String result = "No";
		if (check(moveList, inX, 0, 0) && check(moveList, inY, 0, 1)) {
			result = "Yes";
		}

		System.out.println(result);
	}

	private static boolean check(List<Integer> moveList, int target, int pos, int index) {
		if (index >= moveList.size()) {
			return pos == target;
		}

		int move = moveList.get(index);

		return check(moveList, target, (pos + move), (index + 2)) || check(moveList, target, (pos - move), (index + 2));
	}
}
