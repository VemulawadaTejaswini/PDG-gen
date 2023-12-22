import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();

		if(Math.sqrt(c)-Math.sqrt(a)-Math.sqrt(b)>0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
