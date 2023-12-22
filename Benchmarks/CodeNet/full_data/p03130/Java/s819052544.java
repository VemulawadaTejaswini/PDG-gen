import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = 4;
		int[] town = {0, 0, 0, 0, 0};
		for(int i = 0; i < 3 * 2; i++) {
			town[sc.nextInt()]++;
		}
		int[] count = {0, 0, 0, 0, 0};
		for(int i = 1; i <= N; i++) {
			count[town[i]]++;
		}
		if(count[1] == 2 && count[2] == 2) System.out.println("YES");
		else System.out.println("NO");
	}
}
