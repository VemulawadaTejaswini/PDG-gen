import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		if(a==b) {
			System.out.println(1);
		}
		else if(b==1) {
			System.out.println(0);
		}
		else {
		System.out.println((b/a)+1);
		}
	}

}
