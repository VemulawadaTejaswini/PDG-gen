import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		List<Integer> array = new ArrayList<>();
		long count = 0;
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			array.add(temp);
			if (i != 0 && temp - array.get(i - 1) >= t) {
				count += t;
			} else if (i != 0) {
				int sa = temp - array.get(i - 1);
				count += sa;
			}
			
		}
		
		System.out.println(count+t);

	}
}
