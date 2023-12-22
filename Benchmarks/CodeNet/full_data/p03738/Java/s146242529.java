import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(), b = sc.next();
		int diff = a.compareTo(b);
		if(diff > 0) System.out.println("GREATER");
		else if(diff < 0) System.out.println("LESS");
		else System.out.println("EQUAL");
	}
}