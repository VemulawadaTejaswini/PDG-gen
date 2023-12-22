import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int[] ans = new int[h];
		for(int i = 0; i < h-a; i++) {
			ans[i] = 1;
		}
		for(int i = h-a; i < h; i++) {
			ans[i] = 0;
		}
		
		for(int j = 1; j < b; j++) { 
			for(int i = 1; i < h-a; i++) {
				ans[i] = (ans[i-1] + ans[i])%1000000007;
			}
		}
		
		for(int j = b; j < w; j++) { 
			for(int i = 1; i < h; i++) {
				ans[i] = (ans[i-1] + ans[i])%1000000007;
			}
		}
		
		System.out.println(ans[h-1]);
	}
	
}