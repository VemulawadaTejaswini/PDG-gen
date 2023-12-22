import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		for (int i = 1; i <= 1009; i++) {
//			int a = i / 100 * 8;
//			int b = i / 10;
//			System.out.printf("i:%d, a:%d, b: %d\n", i, a, b);
//		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = -1;
		
		if (a / 8 * 100 == b * 10)
			ans = b * 10;
		
		System.out.println(ans);
		sc.close();
	}
	
	

}
