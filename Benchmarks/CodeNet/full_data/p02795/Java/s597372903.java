import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();

		int a = n/h;
		int b = n/w;

		if(a <= b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
}