import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int[] h = new int[n];
		int s = 0;
		for (int i = 0; i < n; i++) {
			h[i] = input.nextInt();
		}
		if (k >= n) {
			System.out.println(0);
		}else {
			Arrays.sort(h);
			for(int i = 0; i < n-k ;i++) {
				s += h[i]; 
			}
			System.out.printf("%d",s);
		}
		
	}
}