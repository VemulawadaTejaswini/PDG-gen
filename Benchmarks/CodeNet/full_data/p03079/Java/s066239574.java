import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
		if (a == b && a == c) System.out.println("Yes");
		else System.out.println("No");
	}
}