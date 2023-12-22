import java.util.Scanner;

class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.close();
		
		a = a % b;
		
		for(int i = 1; i <= b; i++) {
			if(i * a % b == c ) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}