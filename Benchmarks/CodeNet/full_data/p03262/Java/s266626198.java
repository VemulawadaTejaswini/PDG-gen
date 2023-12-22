import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int startSpot = sc.nextInt();
		int spot[] = new int[num];
		for(int i = 0; i < num; i ++) {
			spot[i] = sc.nextInt();
		}
		int diff[] = new int[num];
		for(int i = 0; i < num; i ++) {
			diff[i] = Math.abs(spot[i] - startSpot);
		}
		Arrays.sort(diff);

		int moveDist = diff[0];
		for(int i = 1; i < num; i ++) {
			moveDist = gcd(moveDist, diff[i]);
		}
		System.out.println(moveDist);
	}

	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a % b);
		}
	}
}