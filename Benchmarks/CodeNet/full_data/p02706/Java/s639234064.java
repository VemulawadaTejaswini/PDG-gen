import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[m];
		
		int total = 0;
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
			total += a[i];
		}
		
		n -= total;
		
		if(n >= 0) {
			System.out.print(n);
		}else {
			System.out.print(-1);
		}
		

	}

}
