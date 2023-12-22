
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long ans = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int count = 0;
				if(i > 0) {
					if(j > 0)
						count++;
					count++;
					if(j < m - 1)
						count++;
				}
				if(j > 0)
					count++;
				count++;
				if(j < m - 1)
					count++;
				if(i < m - 1) {
					if(j > 0)
						count++;
					count++;
					if(j < m - 1)
						count++;
				}
				if(count % 2 == 1)
					ans++;
			}
		}
		System.out.println(ans);
	}

}
