import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i < n + 1; i++) {
			
			if (i % 3 == 0 && i % 5 == 0) {
				list.add(0);
			} else if (i % 3 == 0 && i % 5 != 0) {
				list.add(0);
			} else if (i % 3 != 0 && i % 5 == 0) {
				list.add(0);
			} else {
				list.add(i);
			}
		}
		
		System.out.println(list.stream().mapToLong(x -> x)
			     .sum());
	}

}
