import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int val = n % 2 == 1 ? n - 1 / 2 : n / 2 ; 
		int a = 0;
		int b = 0;
		for(int i = 0; i < n; i++) {
			int tmp = scanner.nextInt();
			if(i + 1  <= val && tmp <= val) a++;
			if(i + 1 >= n - val && tmp <= n - val - n % 2)b++;
		}
		System.out.println(n - 1 - Math.min(a, b));
	}

}