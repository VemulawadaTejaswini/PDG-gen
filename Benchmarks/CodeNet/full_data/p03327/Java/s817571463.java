import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int N = 0;
		N = sc.nextInt();

		if(N < 1000) {
			System.out.println("ABC" + N);
		}else {
			System.out.println("ABD" + (N - 1000 + 1));
		}
	}
}
