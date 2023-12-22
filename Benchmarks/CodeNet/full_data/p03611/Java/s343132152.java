import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] map = new int[100_002];
		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			map[ai]++;
		}
		
		int max = 0;
		for (int i = 1; i < map.length-1; i++) {
			int sum = map[i-1] + map[i] + map[i+1];
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
	}
}
