import java.util.Scanner;

public class SortedArrays {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int inputNum = scanner.nextInt();
			int cnt = 1;
			State state = State.NONE;
			for (int i = 1; i < n; i++) {
				int beforeNum = inputNum;
				inputNum = scanner.nextInt();
				switch (state) {
				case NONE:
					if (beforeNum < inputNum) {
						state = State.UP;
					}
					if (beforeNum > inputNum) {
						state = State.DOWN;
					}
					break;
				case UP:
					if (beforeNum > inputNum) {
						state = State.NONE;
						cnt++;
					}
					break;
				case DOWN:
					if (beforeNum < inputNum) {
						state = State.NONE;
						cnt++;
					}
					break;
				default:
					break;
				}
			}
			System.out.println(cnt);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	enum State {
		NONE, UP, DOWN
	}
}
