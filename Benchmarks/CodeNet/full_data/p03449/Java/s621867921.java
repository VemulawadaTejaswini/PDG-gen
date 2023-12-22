
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] s = new int[5][110];
		int n = scan.nextInt();
		for(int i = 1; i <= n; ++i) {
			s[1][i] = scan.nextInt();
		}
		for(int i = 1; i <= n; ++i) {
			s[2][i] = scan.nextInt();
		}
		int sum = 0,sum2,sum3 = 0;
		for(int i = 1; i <= n; ++i) {
			sum += s[1][i];
			sum2 = sum;
			for(int j = i;j <= n ; ++j) {
				sum += s[2][j];
			}
			if(sum > sum3) {
				sum3 = sum;
			}
			sum = sum2;
			
		}
		System.out.println(sum3);
				
		
	}
}
