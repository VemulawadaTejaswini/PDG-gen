import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long dif = b - a;
		long ans;
		if (dif % 2 == 0) {
			ans = dif / 2;
		} else {
			ans = a - 1 + (dif + 1) / 2;
		}
		
		System.out.println(ans);
		
		sc.close();
	}
	
}

