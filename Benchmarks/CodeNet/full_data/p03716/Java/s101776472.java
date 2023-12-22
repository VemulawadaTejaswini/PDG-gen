import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
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

		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < 3 * N; i++) {
			list.add(sc.nextLong());
		}
		List<BigInteger> scoreList = new ArrayList<>();
		for (int splitIndex = 0; splitIndex <= N; splitIndex++) {
			List<Long> pre = list.subList(0, N + splitIndex);
			List<Long> suf = list.subList(N + splitIndex, 3 * N);

			BigInteger score = BigInteger.ZERO;
			for (long l : pre.stream().mapToLong(i -> i).sorted().skip(splitIndex).toArray()) {
				score = score.add(BigInteger.valueOf(l));
			}
			for (long l : suf.stream().mapToLong(i -> i).sorted().limit(N).toArray()) {
				score = score.subtract(BigInteger.valueOf(l));
			}
			scoreList.add(score);
		}
		System.out.println(scoreList.stream().max((o1, o2) -> o1.compareTo(o2)).get());
	}
}