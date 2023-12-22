import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int num = i;
			int sumDig = 0;
			while (num > 0) {
				sumDig += num % 10;
				num /= 10;
			}
			
			if (a <= sumDig && sumDig <= b) sum += i;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}


