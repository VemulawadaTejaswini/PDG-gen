import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N == 1) {
			System.out.println("Hello World");
		}
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(N == 2) {
			System.out.println(A + B);
		}
	}
}
