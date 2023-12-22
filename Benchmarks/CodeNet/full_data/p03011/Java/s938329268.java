import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int max = 0;
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			int x = sc.nextInt();
			max = Math.max(max, x);
			sum += x;
		}
		System.out.println(sum - max);
	}
}