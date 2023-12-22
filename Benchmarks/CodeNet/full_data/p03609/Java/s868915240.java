import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int t = sc.nextInt();
		int ans = 0;

		if(t <= X) {
			ans = X - t ;
		} else {
			ans = 0;
		}

		System.out.println(ans);
	}
}