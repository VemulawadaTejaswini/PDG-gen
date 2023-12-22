import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[] array = new int[n];
		Arrays.fill(array, 0);
		for(int i = 0; i < m; i++) array[sc.nextInt()] = 1;
		int[] cost = {0,0};
		for(int i = 0; i <= x;i++) cost[0] += array[i];
		for(int i = x; i < n;i++) cost[1] += array[i];
		System.out.println(Math.min(cost[0], cost[1]));
	}

}
