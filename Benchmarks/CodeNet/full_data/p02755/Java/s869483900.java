import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int ans = -1;
		for (int i=0; i<10; i++) {
			int x = B*10 + i;
			if (x * 8 / 100 == A) {
				ans = x;
				break;
			}
		}
		
		System.out.println(ans);
	}
}