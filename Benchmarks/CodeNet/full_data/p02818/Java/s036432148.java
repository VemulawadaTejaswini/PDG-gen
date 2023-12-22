import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		if (a - k <= 0) {
			System.out.println(0 + " " + (b + a - k));
		} else {
			System.out.println((a - k) + " " + b);
		}
//		int a = sc.nextInt();
//		while(true) {
//			int temp;
//			for (int i = 2; i <= a / 2; ++i) {
//				temp = a % i;
//				if (temp == 0) {
//					break;
//				} else {
//					System.out.println(temp);
//					return;
//				}
//			}
//			++a;
//		}
		
		sc.close();
	}

}
