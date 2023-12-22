import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		
		String ab = a + b;
		int num = Integer.valueOf(ab);
		
		for (int i = 1; i * i <= num; i++) {
			if (i * i == num) {
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
	}
}


