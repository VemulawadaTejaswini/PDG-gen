import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int p[] = new int[N];
		int sum = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
			sum += p[i];
			max = Math.max(max, p[i]);
		}
		
		System.out.println(sum - max / 2);
	}
}
