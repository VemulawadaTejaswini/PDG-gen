import java.util.Scanner;

public class src {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a % 2 == 1 && b % 2 == 1){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}