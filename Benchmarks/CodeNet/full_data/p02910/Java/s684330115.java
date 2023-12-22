import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				if (arr[i] == 'L') {
					System.out.println("No");
					return;
				}
			} else {
				if (arr[i] == 'R') {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
