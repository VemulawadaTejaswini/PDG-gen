import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), x = sc.nextInt();
		sc.close();
		double ans = (double)t / (double)x;
		System.out.println(ans);

	}

}
