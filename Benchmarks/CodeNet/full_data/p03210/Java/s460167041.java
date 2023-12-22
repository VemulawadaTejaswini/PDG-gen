
import java.util.Scanner;
public class main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "NO";
		for(int i = 3; i <= 7; i+=2) {
			if(i == n) {
				ans = "YES";
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
