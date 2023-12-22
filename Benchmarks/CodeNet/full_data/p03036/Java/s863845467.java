import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int RATE, DICREASE, ans = 0;
			RATE = sc.nextInt();
			DICREASE = sc.nextInt();
			ans = sc.nextInt();
			
			for (int i = 1; i <= 10; i++) {
				ans = RATE*ans - DICREASE;
				System.out.println(ans);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
