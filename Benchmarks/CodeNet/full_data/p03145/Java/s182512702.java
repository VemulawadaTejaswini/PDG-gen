
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);
		int ans = a[0] * a[1];
		ans /= 2;
		System.out.println(ans);
	}
}