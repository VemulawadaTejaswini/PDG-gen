
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int n1;
		int n2;
		n1 = a > b ? b : a;
		n2 = c > d ? d : c;
		System.out.println(n1 + n2);
	}

}
