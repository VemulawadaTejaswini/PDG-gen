import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		if(N == 105 || N == 135 || N == 165 || N == 189 || N == 195) {
			ans = 1;
		}
		System.out.println(ans);
		sc.close();

	}

}
