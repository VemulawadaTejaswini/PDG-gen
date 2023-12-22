import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static void doIt() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] right = new int[n];
		int num = 0;
		int[] a = new int[n];
		Arrays.fill(a, 0);
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				num = (num + a[j]) % m;
				//System.out.println(num);
				if(num == 0) {
					if(i > 0)right[j] = right[i - 1] + 1;
					else right[j]++;
					break;
				}
			}
			num = 0;
		}
		long sum = 0;
		for(int i = 0; i < n; i++) {
			sum += right[i];
		}
		System.out.println(sum);
		//System.out.println(Arrays.toString(right));
	}
	public static void main(String[] args) {
		Main.doIt();
	}
}