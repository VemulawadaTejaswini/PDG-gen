import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int i,j;
		long cnt;
		double ans = 0.0;
		for(i = 1; i <= n; i++) {
			cnt = 0;
			double temp = i;
			while(temp < k) {
				cnt++;
				temp *= 2;
			}
			ans += (1 / (Math.pow(2, cnt) * n));
		}
		System.out.println(ans);
	}
}
