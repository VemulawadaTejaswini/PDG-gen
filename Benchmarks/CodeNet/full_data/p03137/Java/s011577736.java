import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if (N >= M) {
			System.out.println(0);
			return;
		}
		
		int[] map = new int[M];
		for (int i = 0; i < M; i++) {
			map[i] = sc.nextInt();
		}
		
		Arrays.sort(map);
		
		int sum = 0;
		int[] ruiseki = new int[M-1];
		for (int i = 0; i < M-1; i++) {
			ruiseki[i] = map[i+1] - map[i];
			sum += ruiseki[i];
		}
		
		Arrays.sort(ruiseki);
		
		for (int i = ruiseki.length-1; ruiseki.length-N < i; i--) {
			sum -= ruiseki[i];
		}
		
		
		System.out.println(sum);
		
		
	}
}
