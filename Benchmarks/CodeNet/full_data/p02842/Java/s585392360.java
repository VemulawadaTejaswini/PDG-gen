import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val = (int) (n/(1.08));
		if ((int)(1.08 * val) == n) {
			System.out.println(val);
		} else if ((int) (1.08 * (val + 1)) == n) {
			System.out.println(val + 1);
		} else {
			System.out.println(":(");
		}
		sc.close();
	}

}
