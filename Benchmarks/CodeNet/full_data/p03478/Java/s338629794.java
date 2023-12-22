import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		int n, a, b;
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		a = scan.nextInt();
		b = scan.nextInt();
		
		int total = 0;
		for(int i = 1; i <= n; ++i) {
			int sum = checkSum(i);
			if(sum >= a && sum <= b) {
				total += i;
			}
		}
		
		System.out.println(total);


	}
	
	static int checkSum(int n) {
		int sum = 0;
		while(n > 0) {

			sum += n % 10;
			n /= 10;

		}
		
		return sum;
	}

}
