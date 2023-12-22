import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int []x = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			x[i] = sc.nextInt();
		}
		int ans = 1000000000;
		
		for(int i = 0; i <= n - k ; i++) {
			int a = Math.abs(x[i+k-1]);
			int b = Math.abs(x[i]);
			if(x[i+k-1] * x[i] < 0) {
				int temp = Math.max(a, b) + (Math.min(a, b) * 2);
				ans = Math.min(ans, temp);
			}
			if(x[i+k-1] * x[i] >= 0) {
			 int temp = Math.max(a,b);
			 ans = Math.min(ans, temp);
			}
		}
		System.out.println(ans);
		
	}

	}


