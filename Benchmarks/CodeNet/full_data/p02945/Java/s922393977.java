import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int plus = A + B;
		int minus = A - B;
		int times = A * B;
		
		int culc = Math.max(plus, minus);
		int result = Math.max(culc, times);
		System.out.print(result);

		sc.close();
	}
}
