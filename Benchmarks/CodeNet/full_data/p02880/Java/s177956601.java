import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b = true;
		for(int i=1; i<=9; i++) {
			if(n % i == 0 && n / i <= 9) {
				System.out.println("Yes");
				b = false;
				break;
			}
		}
		if(b) System.out.println("No");

	}

}