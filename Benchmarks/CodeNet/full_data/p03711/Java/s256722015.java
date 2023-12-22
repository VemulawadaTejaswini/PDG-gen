import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		if((x-1)*(x-3)*(x-5)*(x-7)*(x-8)*(x-10)*(x-12)*
				(y-1)*(y-3)*(y-5)*(y-7)*(y-8)*(y-10)*(y-12) == 0
				|| (x-4)*(x-6)*(x-9)*(x-12)*
				(y-4)*(y-6)*(y-9)*(y-12) == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
