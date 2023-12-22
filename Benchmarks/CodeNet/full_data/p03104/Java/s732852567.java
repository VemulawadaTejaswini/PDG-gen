import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ans = 0;
		
		ans = a ^ (a + 1);
		for(long i = a + 1; i < b; i++){
			ans = ans ^ (i + 1);
		}
		
		System.out.println(ans);
	}
}
