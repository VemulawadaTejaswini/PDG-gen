import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i= 0; i < n;i++) {
			int number = sc.nextInt();

			if(number % 2 == 0) {
				if(number % 3 ==0 || number % 5 ==0) {

				}else {
					System.out.println("DENIED");
					return;
				}
			}
		}
		System.out.println("APPROVED");
	}

}