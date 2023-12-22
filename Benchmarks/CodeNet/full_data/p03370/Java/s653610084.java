import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int total = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int y = sc.nextInt();
			total += y;
			if (y < min) {
				min = y;
			}
		}
		System.out.println(n + (x - total) / min);
	}
}
