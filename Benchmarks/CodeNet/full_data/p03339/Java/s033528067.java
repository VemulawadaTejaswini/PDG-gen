import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		List<Integer> l = s.chars().boxed().map(sv -> sv.equals((int) 'E') ? 0 : 1).collect(Collectors.toList());
		long min = n;
		long[] leftAns = new long[n];
		leftAns[0] = 0;

		for (int i = 0; i < n; i++) {
			leftAns[i] = l.stream().skip(i).limit(1).filter(leftN -> leftN == 1).count();
			if(i > 0) {
				leftAns[i] += leftAns[i - 1];
			}
			long right = l.stream().skip(i + 1).filter(leftN -> leftN == 0).count();
			min = Math.min(min, leftAns[i] + right);
		}

		System.out.println(min);
	}
}
