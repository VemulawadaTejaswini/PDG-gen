import java.util.*;
public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt() - 1;
		int trees [] = new int [N];
		for (int i = 0; i < N; i++) 
			trees[i] = sc.nextInt();
		
		Arrays.sort(trees);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N - k; i++) 
			min = Math.min(min, trees[i + k] - trees[i]);
		System.out.println(min);
	}
}
