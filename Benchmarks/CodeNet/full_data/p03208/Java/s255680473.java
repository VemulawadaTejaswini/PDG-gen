import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int min = 1000000000;
				
		int[] trees = new int[n];
		for(int i=0;i<n;i++) {
			trees[i] = sc.nextInt();
		}
		Arrays.sort(trees);
		
		for(int i=0;i<n-k+1;i++) {
			min = Math.min(min, trees[i+k-1] - trees[i]);
		}
		System.out.println(min);
	sc.close();
	}

}
