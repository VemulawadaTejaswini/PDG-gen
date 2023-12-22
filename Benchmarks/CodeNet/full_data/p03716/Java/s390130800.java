import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveD();
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List<Numb> list = new ArrayList<>();
		for (int i = 0; i < 3 * N; i++) {
			list.add(new Numb(sc.nextLong(), i));
		}
		list.sort((o1, o2) -> o1.value > o2.value ? 1 : -1);
		List<BigInteger> scoreList = new ArrayList<>();
		for (int splitIndex = 0; splitIndex <= N; splitIndex++) {
			final int index = splitIndex;
			BigInteger score = BigInteger.ZERO;
			for (Object numb : list.stream().filter(i -> i.index < N + index).skip(splitIndex).toArray()) {
				score = score.add(BigInteger.valueOf(((Numb)numb).value));
			}
			for (Object numb : list.stream().filter(i -> i.index >= N + index).limit(N).toArray()) {
				score = score.subtract(BigInteger.valueOf(((Numb)numb).value));
			}
			scoreList.add(score);
		}
		System.out.println(scoreList.stream().max((o1, o2) -> o1.compareTo(o2)).get());
	}

	class Numb {
		public long value;
		public int index;

		public Numb(long value, int index) {
			this.value = value;
			this.index = index;
		}
	}
}