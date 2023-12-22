import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int v[] = new int[n];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		Arrays.sort(v);
		sum = (v[0] + v[1]) / 2.0;
		for (int i = 2; i < n; i++) {
			sum = (sum + v[i]) / 2.0;
		}
		System.out.println(sum);
	}
}