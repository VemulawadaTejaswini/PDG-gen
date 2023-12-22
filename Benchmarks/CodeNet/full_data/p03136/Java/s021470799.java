import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int max = 0;
		int sum = 0;
		int[] map = new int[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
			max = Math.max(max, map[i]);
			sum += map[i];
		}
		
		sum -= max;
		System.out.println(max < sum ? "Yes": "No");
	}
}