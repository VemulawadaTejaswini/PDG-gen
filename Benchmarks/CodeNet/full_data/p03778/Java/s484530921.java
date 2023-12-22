import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int right = b;
		int left = a;
		if (a > b) {
			right = a;
			left = b;
		}
		int ret = right - (left + W);
		if (ret < 0) {
			System.out.println(0);
			return;
		}
		System.out.println(ret);
	}

}