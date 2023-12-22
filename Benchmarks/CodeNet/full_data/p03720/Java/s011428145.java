import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] counts = new int[n];
		
		for(int i = 0; i<counts.length; i++) {
			counts[i] =0;
		}
		
		for(int i = 0; i<=2*m; i++) {
			int k = sc.nextInt();
			counts[k-1] += 1;
		}
		
		for(int count:counts) {
			System.out.println(count);
		}
		
		sc.close();

	}

}
