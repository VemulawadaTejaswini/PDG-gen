import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Set<String> set = new HashSet<String>();
		int i = 0;
		for(i = 0; i < n; i++) {
			set.add(scan.next());
		}
		if(set.size() == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Four");
		}
	}
}