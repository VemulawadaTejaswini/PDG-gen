
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		
		while(!list.contains(s)) {
			list.add(s);
			if (s % 2 == 0) {
				s /= 2;
			} else {
				s = 3 * s + 1;
			}
		}
		
		System.out.println(list.size() + 1);
		
		scan.close();
	}
}