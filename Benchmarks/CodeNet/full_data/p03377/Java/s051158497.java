import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = sc.nextInt();
		String ans = "";

		if(A > X) {
			ans = "NO";
		} else if(A + B < X) {
			ans = "NO";
		} else {
			ans = "YES";
		}

		System.out.println(ans);

	}

}
