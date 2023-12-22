
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.length; i++) {
			if (min >= list[i]) {
				min = list[i];
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}
}