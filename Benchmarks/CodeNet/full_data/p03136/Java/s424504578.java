import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = 0;
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			int input = scan.nextInt();
			list.add(input);
			
			if (input > max) max = input;
			sum += input;
		}
		
		if (max < (sum - max)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}