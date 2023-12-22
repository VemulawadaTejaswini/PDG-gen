
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		
		byte[] m = new byte[16];
		int cnt1 = 0;
		for (int i = 0; i < 16; i+=2) {
			 if (cnt1 >= a ) {
				break;
			}
			if (m[i] != 1) {
				cnt1++;
				m[i] = 1;
			}
			
		}
		if (cnt1 < a) {
			System.out.println(":(");
			System.exit(0);
		}
		int cnt2 = 0;
		for (int i = 1; i < 16; i+=2) {
			 if (cnt2 >= b ) {
				break;
			}
			if (m[i] != 1) {
				cnt2++;
				m[i] = 1;
			}
		}
		if (cnt1 < b) {
			System.out.println(":(");
			System.exit(0);
		}
		
		System.out.println("Yey!");
		
	}

}
