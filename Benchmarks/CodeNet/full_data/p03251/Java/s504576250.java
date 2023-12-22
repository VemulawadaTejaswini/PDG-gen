import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int[] at = new int[n];
		int[] bt = new int[m];
		
		for(int i = 0; i < n; i++) {
			at[i] = sc.nextInt();
		}
		
		for(int i = 0; i < m; i++) {
			bt[i] = sc.nextInt();
		}
		
		for(int i = x+1; i <= y; i++) {
			int count = 0;
			for(int a : at) {
				if(a < i) {
					count++;
				}
			}
			
			for(int b : bt) {
				if(b >= i) {
					count++;
				}
			}
			
			if(count == bt.length+at.length) {
				System.out.println("No War");
				return;
			}

		}
		System.out.println("War");
	}
}