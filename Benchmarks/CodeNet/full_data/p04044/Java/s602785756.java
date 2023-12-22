import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		Set<String> set = new HashSet<String>();
		for (int i=0; i<N; i++) {
			char[] a = sc.next().toCharArray();
			Arrays.sort(a);
			set.add(String.valueOf(a));
		}
		Object[] o = set.toArray();
		Arrays.sort(o);
		for (int i=0; i<N; i++) {
			System.out.print(o[i]);
		}
	}
}
