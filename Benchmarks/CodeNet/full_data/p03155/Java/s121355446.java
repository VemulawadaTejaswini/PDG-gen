import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int H = sc.nextInt();
	static int W = sc.nextInt();
	public static void main(String[] args) {
		int ans = (N-H+1)*(N-W+1);
		System.out.println(ans);
	}
}
