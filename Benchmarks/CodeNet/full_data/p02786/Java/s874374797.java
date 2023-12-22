import java.util.Scanner;

public class Main {
	static long f(long X){
		if(X == 1){
			return 1;
		}
		long H = X / 2;
		return 2 * f(H) + 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		System.out.println(f(H));
	}
}
