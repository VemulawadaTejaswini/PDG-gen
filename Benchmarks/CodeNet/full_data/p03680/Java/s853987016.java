import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Set<Integer> set = new HashSet<>();
		set.add(0);
		for(int i = 0;;i++) {
			int oldLen = set.size();
			set.add(a[i]);
			i = a[i] -2;
			int newLen = set.size();
			if(oldLen == newLen || set.contains(2)) {
				break;
			}
		}
		System.out.println(set.contains(2) ? set.size()-1 : -1);
	}
}