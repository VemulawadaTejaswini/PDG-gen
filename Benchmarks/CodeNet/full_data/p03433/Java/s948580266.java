import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		sc.close();
		int res = N % 500;
		if(res > A) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}