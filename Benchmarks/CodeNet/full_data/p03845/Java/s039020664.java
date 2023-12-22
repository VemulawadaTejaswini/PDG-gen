import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] t = new int[n+1];
		for(int i = 1; i <= n; i++){
			t[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int [] p = new int[m+1];
		int [] x = new int[m+1];
		for(int i = 1; i <= m; i++){
			p[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= n; j++){
				sum += t[j];
				}
			sum = sum + x[i] - t[i];
			System.out.println(sum);
			sum = 0;
		}
	}
}
