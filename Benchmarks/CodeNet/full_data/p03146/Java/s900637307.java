
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		while (!list.contains(n)) {
			
			list.add(n);
			if (n % 2 == 0) n /= 2;
			else n = 3 * n + 1;
			
		}
		
		System.out.println(list.size() + 1);
	}
}