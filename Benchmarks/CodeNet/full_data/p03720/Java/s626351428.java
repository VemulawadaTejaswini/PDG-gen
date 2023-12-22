import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] roads = new int[n];
		int a, b;
		for(int i = 0; i < m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			roads[a - 1]++;
			roads[b - 1]++;
		}
		for(int j : roads) {
			System.out.println(j);
		}
	}
}