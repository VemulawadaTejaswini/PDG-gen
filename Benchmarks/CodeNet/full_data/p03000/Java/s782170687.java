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
		for( j = 1; j <= n ; j++) {
			
			if(d[j - 1] <= x) {
				int l = sc.nextInt();
				d[j] = d[j - 1] + l;
			}
			else if (d[j - 1] > x) break;
			
		}
		System.out.println(j - 1);

	}

}
