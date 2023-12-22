import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		
		long lastA = Math.max(a - k, 0);
		long lastB = Math.max(b - (k - a), 0);
		
		System.out.println(lastA + " " + lastB);
		
		sc.close();
	}
	
}


