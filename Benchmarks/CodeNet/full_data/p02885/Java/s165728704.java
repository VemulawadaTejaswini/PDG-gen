import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X= sc.nextInt();
		int Y = sc.nextInt();
		if (X<Y*2) {
			System.out.println(0);
			return ;
		}

		System.out.println(X-Y*2);
	}
}