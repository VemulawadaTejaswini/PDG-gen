import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		double ans;
		ans = (l/3) * ((l-(l/3))/2) * (l-((l-(l/3))));
		System.out.println(ans);
	}
}
