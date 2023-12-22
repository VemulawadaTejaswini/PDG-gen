import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();

		scan.close();
		if(b%a<=a-1) {
			System.out.println((b%a==0)? b/a:b/a+1);
		}else {
			System.out.println(b/a);
		}

	}
}