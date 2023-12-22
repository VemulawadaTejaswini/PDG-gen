import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int ans = 0;
		for(int i = 1; i <= n; i+=2) {
			int sum = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) sum++;
			}
			if(sum == 8) ans++;
		}
		
		System.out.println(ans);
	}

}
