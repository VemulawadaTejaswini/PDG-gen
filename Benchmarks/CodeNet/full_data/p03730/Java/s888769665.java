
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int sum = 0;
		for(int i = 1; sum <= A * B; i++) {
			sum = A * i;
			if(sum % B == C) {
				System.out.println("YES");
				break;
			}
			if(sum > A * B) {
				System.out.println("NO");
				break;
			}
		}
		scan.close();

	}

}
