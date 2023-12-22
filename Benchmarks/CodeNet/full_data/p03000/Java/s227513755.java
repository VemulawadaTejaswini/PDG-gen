
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int []d = new int [n+1];
		d[0] = 0;
		int j;
		int bound = 1;
		for( j = 1; j <= n ; j++) {
			int l = sc.nextInt();
			d[j] = d[j - 1] + l;
			if (d[j] <= x) 
				bound++;
			else {
				break;
			}
		
		}
		System.out.println(bound);

	}

}
