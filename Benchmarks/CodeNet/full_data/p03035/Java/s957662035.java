import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			int AGE, PRICE, ans;
			AGE = sc.nextInt();
			PRICE = sc.nextInt();
			
			if (AGE < 6) {
				ans = 0;
			} else if (AGE < 13) {
				ans = PRICE/2;
			} else {
				ans = PRICE;
			}
			
			System.out.println(ans);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
