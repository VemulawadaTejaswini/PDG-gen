import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		int num = n;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		String ans = n % sum == 0 ? "Yes" : "No";
		System.out.println(ans);
		
		sc.close();
	}
}


