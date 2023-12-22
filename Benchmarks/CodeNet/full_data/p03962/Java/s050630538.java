import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// get a integer
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(Main.countCans(a, b, c));
		sc.close();
	}
	
	static int countCans(int a, int b, int c) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(a);
		set.add(b);
		set.add(c);
		return set.size();
	}

}