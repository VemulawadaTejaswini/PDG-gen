import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		int con = 0;

		con = H /A;
		if (H %A != 0 ) {
			con++;
		}
		System.out.println(con);
	}
}