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

		for (int i = 0; i < n; i++) {
			long left = l.stream().limit(i).filter(leftN -> leftN == 1).count();
			long right = l.stream().skip(i).filter(leftN -> leftN == 0).count();
			min = Math.min(min, left + right);
		}

		System.out.println(min);
	}
}
