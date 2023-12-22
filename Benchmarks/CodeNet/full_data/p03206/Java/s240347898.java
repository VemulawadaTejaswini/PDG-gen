package kyopro;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "Christmas";
		for(int i = 25; i >= n; i--) {
			ans = ans +" Eve";
		}
		System.out.println(ans);
		sc.close();
	}

}
