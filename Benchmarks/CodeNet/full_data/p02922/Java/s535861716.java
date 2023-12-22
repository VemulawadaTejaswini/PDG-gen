import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt() - 1;
		int B = sc.nextInt();
		sc.close();
		
		System.out.println((B + A - 2) / A);
	}
}