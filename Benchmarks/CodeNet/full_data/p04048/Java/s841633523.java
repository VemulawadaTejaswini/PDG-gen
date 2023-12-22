import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),X = sc.nextInt();

		int a = N - X;
		int b = X*3;
		int c = (N - (X+X)) * 3;

		if(N / 2 == X)System.out.println(X * 3);
		else System.out.println(a + b + c);
	}
}
