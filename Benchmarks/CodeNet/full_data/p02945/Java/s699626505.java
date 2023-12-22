import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int plus = A + B;
		int minus = A - B;
		int kakeru = A * B;

		int res = Math.max(plus, minus);

		if(res > kakeru){
			System.out.println(res);
		} else {
			System.out.println(kakeru);
		}
		
	}
}
