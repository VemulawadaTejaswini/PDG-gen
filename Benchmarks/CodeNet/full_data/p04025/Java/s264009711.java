
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		long result = Long.MAX_VALUE;
		
		for(int i = -100; i <= 100; i++) {
			long tmp = 0;
			
			for(int j = 0; j < n; j++) {
				tmp += Math.pow(a[j] - i, 2);
			}
			
			result = Math.min(tmp, result);
		}
		
		System.out.println(result);
	}	
}
