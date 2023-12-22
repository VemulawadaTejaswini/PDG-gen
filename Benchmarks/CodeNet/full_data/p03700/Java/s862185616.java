import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int A = sc.nextInt();
		final int B = sc.nextInt();

		int[] monsters = new int[N];
		int maxHp = 0;
		for (int i = 0; i < N; i++) {
			monsters[i] = sc.nextInt();
			maxHp = Math.max(maxHp, monsters[i]);
		}

		int turnLow = 0;
		int turnHigh = maxHp / B + 1;

		while (turnLow < turnHigh) {
			int turn = (turnLow + turnHigh) / 2;
			if (clearable(turn, monsters, A, B)) {
				turnHigh = turn;
			} else {
				turnLow = turn + 1;
			}
		}
		System.out.println(turnLow);
		sc.close();
	}

	private boolean clearable(int t, int[] m, int A, int B) {
		int delta = A - B;
		int baseDamage = B * t;
		long extraTurn = 0;
		for (int i = 0; i < m.length; i++) {
			extraTurn += divRoundUp(Math.max(0, m[i] - baseDamage), delta);
			if (extraTurn > t) {
				return false;
			}
		}
		return true;
	}

	private int divRoundUp(int n, int divisor) {
		if (n % divisor == 0) {
			return n / divisor;
		} else {
			return n / divisor + 1;
		}
	}
}