import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int min = 0;
		int max = 100001;
		for (int i = 0; i < M; i++) {
			min = Math.max(min, sc.nextInt());
			max = Math.min(max, sc.nextInt());
		}
		sc.close();
		System.out.println(max - min + 1);
	}
}
