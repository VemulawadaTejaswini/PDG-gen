import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextInt();
		long k = scan.nextInt();
		
		long x, y = 0;
		
		x = n % k;	//x < k
		y = k - x;
		
		if(x < y) {
			System.out.println(x);
		}
		else if(x > y) {
			System.out.println(y);
		}
		
	}

}
