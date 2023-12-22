import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		String a = String.valueOf(A);
		String b = String.valueOf(B);

		System.out.println(a.length()>=2 || b.length()>=2?-1:A*B);

		scan.close();

	}

}
