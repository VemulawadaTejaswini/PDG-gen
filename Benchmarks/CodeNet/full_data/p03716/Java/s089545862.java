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
		List<Long> scoreList = new ArrayList<Long>();
		for (int splitIndex = 0; splitIndex < N; splitIndex++) {
			List<Long> pre = list.subList(0, N + splitIndex);
			List<Long> suf = list.subList(N + splitIndex, 3 * N);
			long preMaxSum = pre.stream().mapToLong(i -> i).sorted().skip(splitIndex).sum();
			long sufMinSum = suf.stream().mapToLong(i -> i).sorted().limit(N).sum();
			scoreList.add(preMaxSum - sufMinSum);
		}
		System.out.println(scoreList.stream().max(Comparator.naturalOrder()).get());
	}
}