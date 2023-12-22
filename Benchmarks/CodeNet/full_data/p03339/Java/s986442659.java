import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		List<Integer> l = s.chars().boxed().map(sv -> sv.equals((int) 'E') ? 1 : -1).collect(Collectors.toList());
		long min = n;
		long[] leftAns = new long[n];
		long[] rightAns = new long[n];
		leftAns[0] = 0;
		rightAns[0] = l.stream().skip(1).filter(rightN -> rightN == 1).count();

		for (int i = 1; i < n; i++) {
			leftAns[i] = leftAns[i - 1] + (l.get(i - 1) == -1 ? 1 : 0);
			rightAns[i] = rightAns[i - 1] - (l.get(i) == 1 ? 1 : 0);
			min = Math.min(min, leftAns[i] + rightAns[i]);
		}

		System.out.println(min);
	}
}
