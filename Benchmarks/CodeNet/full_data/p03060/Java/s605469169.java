import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] gems = new int[N];
		for (int i = 0; i < N; i++) {
			if (sc.hasNext()) {
				gems[i] = sc.nextInt();
			}
		}
		
		int[] costs = new int[N];
		for (int i = 0; i < N; i++) {
			if (sc.hasNext()) {
				costs[i] = sc.nextInt();
			}
		}
		
		int[] values = new int[N];
		for (int i = 0; i < N; i++) {
			values[i] = gems[i] - costs[i];
		}
		int result = 0;
		for (int i = 0; i < N; i++) {
			values[i] = gems[i] - costs[i];
			if (values[i] > 0) {
				result += values[i];
			}
		}
		
		System.out.println(result);
		
	} 
}
