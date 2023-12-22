import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		set.add(sc.next());
		set.add(sc.next());
		set.add(sc.next());
		System.out.println(set.size());
	}
}