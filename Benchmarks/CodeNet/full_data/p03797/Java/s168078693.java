
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();  //s型
		long M = sc.nextLong();  //c型
		
		long count = 0;
		while(true) {
			if(N > 0) {
				N--;
				M -= 2;
				if(M < 0) {
					break;
				}
				count++;
			} else {
				M -= 4;
				if(M < 0) {
					break;
				}
				count++;
			}
		}
		System.out.println(count);
	}
}

