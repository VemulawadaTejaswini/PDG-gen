import java.util.*;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] aList = new Integer[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			aList[i] = a;
		}
		Arrays.sort(aList, Collections.reverseOrder());
		
		int alice = 0;
		int bob = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				alice += aList[i];
			} else {
				bob += aList[i];
			}
		}
		System.out.println(alice - bob);
	}
}
