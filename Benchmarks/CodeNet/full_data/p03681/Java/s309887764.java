import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int ans = 1;
		if(Math.abs(n-m) >= 2){
			System.out.println(0);
		}else if (Math.abs(n-m) == 0) {
			for(int i = 1; i < n+1; i++){
				ans = ans * i % 1000000007;
			}
			System.out.println(ans * 2);
		}else {
			int max = Math.max(n, m);
			for(int i = 1; i < max +1 ; i++){
				ans = ans * i % 1000000007;
			}
			System.out.println(ans * ans/max);
		}
	}
}
