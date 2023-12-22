import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		
		long l = (a - 1) / x;
		long r = b / x;
		
		System.out.println(r - l);
		
		sc.close();
	}
	
}


