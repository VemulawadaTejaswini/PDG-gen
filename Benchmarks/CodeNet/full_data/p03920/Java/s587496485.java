import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		int sum = 0;
		int max = 0;
		for(int i = 1; i <= N; i++) {
			sum += i;
			if(sum >= N) {
				max = i;
				break;
			}
		}
		ans = sum - N;
		for(int i = 1; i <= max; i++) {
			if(i == ans) continue;
			System.out.println(i);
		}
	}
}
