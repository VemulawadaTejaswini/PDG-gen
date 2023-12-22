import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int out = X;
		out -= A;
		out = out - B * (out / B);
		System.out.println(out);
	}

}
