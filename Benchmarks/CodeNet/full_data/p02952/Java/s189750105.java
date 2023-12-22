import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int ans = 0;
		
		if(n<10) {
			System.out.println(n);
			return;
		}
		ans += 9;
		
		if(n<1000) {
			System.out.println(ans + Math.max(0, n - 99));
			return;
		}
		ans += 900;
		System.out.println(ans + Math.max(0, n - 10000));
	}

}
