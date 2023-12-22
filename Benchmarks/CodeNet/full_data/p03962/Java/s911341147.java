import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Set s = new HashSet<Integer>();
		s.add(a);
		s.add(b);
		s.add(c);
		System.out.println(s.size());
		
	}
}
