import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 1;
		
		if (n < 105) {
			System.out.println(0);
			System.exit(0);
		}
		
		int cnt;
		for (int i = 107; i <= n; i+=2) {
			cnt = 2;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) cnt++;
			}
			if (cnt == 8) count++;
		}
		
		System.out.println(count);
	}
}