import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long k = sc.nextLong();

		if(n == k) {
			System.out.println(0);
			return;
		}


		if(n>k) {
			if(n%k == 0) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		}else{
			if(n < Math.abs(n-k)) {;
				System.out.println(n);
			}else{
				System.out.println(Math.abs(n-k));
			}
		}

	}
}
