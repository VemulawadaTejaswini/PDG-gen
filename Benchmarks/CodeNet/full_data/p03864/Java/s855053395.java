
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int input[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		
		long total = 0;
		
		for(int i = 1; i < n; i++) {
			if(input[i] + input[i - 1] > x) {
				int remain = input[i] + input[i - 1] - x;
				
				if(input[i] >= remain) {
					input[i] -= remain;
				}
				else {
					input[i] = 0;
				}
				
				total += remain;
			}
		}
		
		System.out.println(total);
	}

}
