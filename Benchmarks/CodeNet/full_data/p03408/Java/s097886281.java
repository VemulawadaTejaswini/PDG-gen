
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> hashSet = new HashSet<String>();
		String[] blueCards = new String[n];
		for(int i = 0; i < n; i++) {
			String tmp = sc.next();
			blueCards[i] = tmp;
			hashSet.add(tmp);
		}
		int m = sc.nextInt();
		String[] redCards = new String[m];
		for(int i = 0; i < m; i++) {
			redCards[i] = sc.next();
		}
		int maxSum = 0;
		for(String str : hashSet) {
			int tmp = 0;
			for(String blue : blueCards) {
				if(blue.equals(str)) {
					tmp++;
				}
			}
			for(String red : redCards) {
				if(red.equals(str)) {
					tmp--;
				}
			}
			if(tmp > 0 && maxSum < tmp) {
				maxSum = tmp;
			}
		}
		System.out.println(maxSum);

	}

}
