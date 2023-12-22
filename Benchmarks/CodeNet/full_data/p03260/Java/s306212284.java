import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		String ans = "Yes";
		if(A == 2 || B == 2) {
			ans = "No";
		}

		System.out.println(ans);

		sc.close();
	}

}
