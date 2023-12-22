
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt();
		int max = scan.nextInt();
		int k = scan.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = min; i < min + k; i++) {
			if (i > max) {
				break;
			}
			list.add(i);
		}
		
		for (int i = max; max - k < i; i--) {
			if (i < min) {
				break;
			}
			list.add(i);
		}
		Collections.sort(list);
		Set<Integer> set = new HashSet<Integer>(list);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}
}