import java.util.Scanner;

//AtCoder Beginner Contest 118
//A	B +/- A
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		System.out.println((B % A) == 0 ? B + A : B - A);
	}
}
