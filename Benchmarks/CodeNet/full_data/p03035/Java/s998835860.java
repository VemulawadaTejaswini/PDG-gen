import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a>=13) {
			System.out.print(a);
		}else if(6<=a&&a<=12) {
			System.out.print(a/2);
		}else {
			System.out.print(0);
		}
		sc.close();

	}

}
