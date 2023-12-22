import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		for (int i=1; i<=1000; i++){
			int tax8 = (int) (i * 0.08);
			int tax10 = (int) (i * 0.1);
			if (tax8 == A && tax10 == B){
				System.out.println(i);
				return;
			}
		}
		System.out.println("-1");
	}
}