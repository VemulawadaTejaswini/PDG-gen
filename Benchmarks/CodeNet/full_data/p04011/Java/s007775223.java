import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a = input.nextInt();
		long b = input.nextInt();
		long c = input.nextInt();
		long d = input.nextInt();
		System.out.println(Math.min(a, b)*c + Math.max(a-b,0) * d);
	
	
	}
				
}